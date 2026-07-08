public class CanBePalindrome {
    public boolean isPalindrome(String s, int left, int right, int count) {
        while (left <= right) {
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);
            if (ch1 != ch2)
            {
                if (count == 1)
                {
                    return false;
                }
                else
                {
                    count++;
                    return isPalindrome(s, left + 1, right, count) || isPalindrome(s, left, right - 1, count);
                }
            }
            left++;
            right--;
            
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        
        return isPalindrome(s, 0, s.length() - 1, 0);
    }
}
