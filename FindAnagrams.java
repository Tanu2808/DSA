import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int k = 0; k < p.length(); k++) {
            map.put(p.charAt(k), map.getOrDefault(p.charAt(k), 0) + 1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        while (j < s.length()) {
            char right = s.charAt(j);
            window.put(right, window.getOrDefault(right, 0) + 1);
            j++;
            if (j - i > p.length())
            {
                char left = s.charAt(i);
                if (window.get(left) == 1) window.remove(left);
                else window.put(left, window.get(left) - 1);
                i++;
            }
            if (j - i == p.length() && window.equals(map)) list.add(i);
        }
        return list;
    }
}
