public class MaxVowels {
    public int maxVowels(String s, int k) {

        String str = s.substring(0, k);
        int count = countVowels(str);

        int max = count;
        int begin = 0;
        int end = k;

        while (end < s.length()) {

            if (checkVowel(s.charAt(end))) {
                count++;
            }

            if (checkVowel(s.charAt(begin))) {
                count--;
            }

            max = Math.max(max, count);

            begin++;
            end++;
        }

        return max;
    }

    public int countVowels(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (checkVowel(str.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public boolean checkVowel(char ch) {

        ch = Character.toLowerCase(ch);

        return ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u';
    }
}
