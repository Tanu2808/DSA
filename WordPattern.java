
import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        int i = 0;
        for (String str: s.split(" "))
        {
            if (map1.containsKey(pattern.charAt(i)))
            {
                if (!map1.get(pattern.charAt(i)).equals((str)))
                {
                    return false;
                }
            }
            else {
                if (map2.containsKey(str)) {
                    return false;
                }
                map1.put(pattern.charAt(i), str);
                map2.put(str, pattern.charAt(i));
            }
            i++;
        }
        return true;
    }
    
}
