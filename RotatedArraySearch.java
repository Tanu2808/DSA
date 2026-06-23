public class RotatedArraySearch {
    public int binarySearch(int[] nums, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
    public int findPiviot(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) low = mid + 1;
            else high = mid;
        }
        return low;
    }
    public int search(int[] nums, int target)
    {
        int k = findPiviot(nums);
        if (target >= nums[k] && target <= nums[nums.length - 1]) return binarySearch(nums, target, k, nums.length - 1);
        return binarySearch(nums, target, 0, k - 1);
    }
}
