import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String temp = Arrays.toString(ch);
            if (!map.containsKey(temp)) {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                result.add(list);
                map.put(temp, result.indexOf(list));
            }
            else{
                List<String> list = result.get(map.get(temp));
                list.add(strs[i]);
            }
        }
        
        return result;
    }
}
