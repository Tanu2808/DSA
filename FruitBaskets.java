import java.util.HashMap;

public class FruitBaskets {
    public int totalFruit(int[] nums) {
        int left = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.size() > 2) {
                int count = map.get(nums[left]) - 1;

                if (count == 0) {
                    map.remove(nums[left]);
                } else {
                    map.put(nums[left], count);
                }

                left++;
            }
            max = Math.max(max, right - left + 1);

        }
        return max;
    }
}
