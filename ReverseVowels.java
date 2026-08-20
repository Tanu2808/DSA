public class ReverseVowels {

    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        int j = str.length() - 1;
        while (i <= j)
        {
            if (!isVowel(str.charAt(i))) i++;
            else if (!isVowel(str.charAt(j))) j--;
            else {
                char temp = str.charAt(i);
                str.setCharAt(i, str.charAt(j));
                str.setCharAt(j, temp);
                i++;
                j--;
            } 
        }
        return str.toString();
    }

    public static boolean isVowel(char ch) {
        char lowerCh = Character.toLowerCase(ch);
        return lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u';
    }
}