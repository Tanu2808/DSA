import java.util.HashSet;

public class SubStringCount {
    public int countGoodSubstrings(String s) {
        int count = 0;
        if (s.length() < 3) return count;

        int i = 0;
        int j = 2;
        while (j < s.length())
        {
            int temp = i;
            HashSet<Character> set = new HashSet<>();
            while (temp <= j) {
                set.add(s.charAt(temp++));
            }
            if (set.size() == 3) count++;
            i++;
            j++;
        }
        return count;
    }
}
