public class ValidAnagram {
    public String countSort(String str)
    {
        StringBuilder string  = new StringBuilder();
        int[] chars = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int ch = (int) Character.toLowerCase(str.charAt(i));
            chars[ch - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            while (chars[i] > 0)
            {
                string.append((char) ('a' + i));
                chars[i]--; 
            }
            
        }
        return string.toString();
    }
    public boolean isAnagram(String s, String t) {
        return countSort(s).equals(countSort(t));
    }
}
