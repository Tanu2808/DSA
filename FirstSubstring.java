public class FirstSubstring {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length() || needle.isEmpty()) return -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0))
            {
                boolean flag = true;
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(j + i) != needle.charAt(j))
                    {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) return i;
            }
        }
        return -1;
    }
}
