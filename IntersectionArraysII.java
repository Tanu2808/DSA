import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i < nums1.length;i++)
        {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                result.add(nums2[i]);
                if (map.get(nums2[i]) > 1) map.put(nums2[i], map.get(nums2[i]) - 1);
                else map.remove(nums2[i]);
            }
        }
        int[] arr = new int[result.size()];
        int i = 0;
        for (Integer j : result) {
            arr[i++] = j;
        }
        return arr;
    }
}
