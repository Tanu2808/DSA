class NumArray {

    int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) prefix[i] = prefix[i - 1] + nums[i];
            else prefix[i] = nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if (left == 0) return prefix[right];
        return prefix[right] - prefix[left - 1];

    }
}