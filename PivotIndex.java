public class PivotIndex {
    public int pivotIndex(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = 0;

            if (i == 0) left = 0;
            else left = nums[i - 1];
            
            if (i == nums.length - 1) right = 0;
            else right = (nums[nums.length - 1] - nums[i]);
            
            if (left == right) return i;
        }
        return -1;
    }
}
