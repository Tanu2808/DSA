public class LongestPalindrome {
    public String expand(String s, int left, int right)
    {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            right++;
            left--;
        }
        return new String(s.substring(left + 1, right - 1));
        
    }
    public String longestPalindrome(String s) {
        String longest = new String();
        for (int i = 0; i < s.length(); i++) {
            String str = expand(s, i, i);
            longest = str.length() > longest.length() ? str : longest;
            str = expand(s, i, i + 1);
            longest = str.length() > longest.length() ? str : longest;
        }
        return longest;
    }

}
