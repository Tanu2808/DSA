public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int max = 0;
        String subString = new String();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            
            if (!subString.contains(String.valueOf(s.charAt(i))))
            {
                max++;
                subString = subString + s.charAt(i);
            }
            else{
                while (subString.contains(String.valueOf(s.charAt(i)))) {
                    subString = subString.substring(1);
                    max--;
                }
                max++;
                subString = subString + s.charAt(i);
            }
            longest = max > longest ? max : longest;
        }
        return longest;
    }
}
