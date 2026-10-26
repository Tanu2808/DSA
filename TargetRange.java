public class TargetRange {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int first = -1;

        // Find the first occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                if (nums[mid] == target) {
                    first = mid;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (first == -1) {
            return new int[] {-1, -1};
        }

        left = first;
        right = nums.length - 1;
        int last = first;

        // Find the last occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                if (nums[mid] == target) {
                    last = mid;
                }
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[] {first, last};
    }
}
