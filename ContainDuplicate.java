import java.util.HashMap;

public class ContainDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        // map.forEach((key, value) - > {if (value > 1) return true});
        for (Integer value : map.values()) if (value > 1) return true;
        return false;
    }
}
