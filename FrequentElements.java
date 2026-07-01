import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int[] arr = new int[k];
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());
        for (int i = 0; i < k; i++) {
            arr[i] = list.get(i).getKey();
        }
        return arr;
        
    }
}
