import java.util.HashMap;

public class PermutationString {
    public boolean checkInclusion(String s1, String s2) {
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int k = 0; k < s1.length(); k++) {
            map.put(s1.charAt(k), map.getOrDefault(s1.charAt(k), 0) + 1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        while (j < s2.length()) {
            char right = s2.charAt(j);
            window.put(right, window.getOrDefault(right, 0) + 1);
            j++;
            if (j - i > s1.length())
            {
                char left = s2.charAt(i);
                if (window.get(left) == 1) window.remove(left);
                else window.put(left, window.get(left) - 1);
                i++;
            }
            if (j - i == s1.length() && window.equals(map)) return true;
        }
        return false;
    }
}