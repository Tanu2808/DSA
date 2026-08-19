public class LeftRightSumDiff {

    public int[] leftRightDifference(int[] nums) {
        int total = 0;
        for (int i = 0;i < nums.length;i++)
        {
            total += nums[i];
        }
        int leftSum = 0;
        int[] arr = new int[nums.length];
        for (int i = 0;i < nums.length;i++)
        {
            arr[i] = Math.abs(leftSum - (total - leftSum - nums[i]));
            leftSum += nums[i];
        }
        return arr;

    }
}