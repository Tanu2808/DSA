import java.util.ArrayList;

public class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = k;
        while (j <= nums.length)
        {
            list.add(maximum(nums, i, j));
            i++;
            j++;
        }
        int[] arr = new int[list.size()];

        // 2. Copy elements manually
        for (int l = 0; l < list.size(); l++) {
            arr[l] = list.get(l); // Java automatically unboxes Integer to int here
        }
        return arr;

    }
    public int maximum(int[] nums, int i, int j)
    {
        int max = Integer.MIN_VALUE;
        while (i < j) {
            max = Math.max(max , nums[i++]);
        }
        return max;
    }
}
