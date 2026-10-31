public class ReverseWords {
    public String reverseWords(String s) {
        String[] list = s.trim().split("\\s+");
        StringBuilder str = new StringBuilder();
        for (int i = list.length - 1; i >= 0; i--) {
            str.append(list[i]);
            if (i > 0) {
                str.append(" ");
            }
        }
        return str.toString();
    }
}
