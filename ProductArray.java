public class ProductArray {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            if (nums[i] != 0)
            {
                product *= nums[i];
            }
            else zeroCount++;
        }
        for (int i = 0; i < result.length; i++) {
            if (zeroCount == 0)
            {
                result[i] = product / nums[i];
            }
            else if (zeroCount == 1)
            {
                if (nums[i] != 0)
                {
                    result[i] = 0;
                }
                else result[i] = product;
            }
            else result[i] = 0;
        }
        return result;
    }
}
