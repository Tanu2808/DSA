public class MissingPositive {
    public int firstMissingPositive(int[] nums) {
        int missing = 0;
        for (int i = 1; i <= nums.length; i++) {
            missing = i;
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j])
                {
                    found = true;
                    break;
                }
            }
            if (!found) return missing;
        }
        return missing + 1;
    }
}
