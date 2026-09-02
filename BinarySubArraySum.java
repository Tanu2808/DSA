public class BinarySubArraySum {
    public int atMost(int[] nums, int goal) {
        int count = 0;
        int i = 0, j = 0;
        int sum = 0;
        while (j < nums.length) {
            sum += nums[j];
            while (sum > goal) {
                sum -= nums[i];
                i++;
            }
            count += j - i + 1;
            j++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
}
