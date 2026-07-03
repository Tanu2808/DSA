import java.util.HashSet;

public class MissingPositiveHashSet {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) set.add(nums[i]);
            if (nums[i] > max) max = nums[i];
        }
        for (int i = 1; i <= set.size(); i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return max + 1;
    }
}
