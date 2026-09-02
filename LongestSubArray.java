public class LongestSubArray {
    public int longestSubarray(int[] nums) {
        int count = 0;
        int i = 0, j = 0;
        int k = 1;
        while (j < nums.length) {
            if (nums[j] == 0) k--;
            while (k < 0) {
                if (nums[i] == 0) k++;
                i++;
            }
            count = Math.max(count, j - i + 1);
            j++;
        }
        return count;
    }
}
