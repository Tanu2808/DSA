import java.util.HashSet;

public class LongestSubStr {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        HashSet<Character> chars = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (chars.contains(s.charAt(right))) {
                chars.remove(s.charAt(left));
                left++;
            }
            chars.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
