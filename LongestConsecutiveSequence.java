import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {

        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                int current = num;

                while (current != Integer.MAX_VALUE &&
                        set.contains(current + 1)) {
                    current++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }
        return max;
    }
}
