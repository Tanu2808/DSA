import java.util.HashMap;

public class LongestRepeatingChar {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(j)));
            while ((j - i + 1) - maxFreq > k) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        
        return max;
    }
}
