public class FindDifference {
    public char findTheDifference(String s, String t) {
        int[] chars = new int[26];

        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
        }
        chars[t.charAt(t.length() - 1) - 'a']--;
        char result = ' ';
        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] == -1) {
                result = (char) ('a' + i);
                break;
            }
        }
        return result;
    }
}
