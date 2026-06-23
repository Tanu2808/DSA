public class SearchRange {

    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurance(nums, target);
        int last = lastOccurance(nums, target);
        int[] result = {first, last};
        return result;
    }

    private int lastOccurance(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MIN_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
            {
                ans = (mid > ans ? mid : ans);
                low = mid + 1;
            }
            else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return (ans == Integer.MIN_VALUE ? -1 : ans);
    }

    private int firstOccurance(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
            {
                ans = (mid < ans ? mid : ans);
                high = mid - 1;
            }
            else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return (ans == Integer.MAX_VALUE ? -1 : ans);
    }
}