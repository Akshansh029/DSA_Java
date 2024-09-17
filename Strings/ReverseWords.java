
// Leetcode 151 Reverse words in a string
public class ReverseWords {

    static String reverseWords(String s) {
        s = s.trim();
        s = s.toLowerCase();
        String[] strArr = s.split(" ");
        StringBuilder str = new StringBuilder();

        for (int i = strArr.length - 1; i >= 0; i--) {
            strArr[i] = strArr[i].trim();
            if (!strArr[i].isEmpty()) {
                if (i == strArr.length - 1) {
                    str.append(strArr[i]);
                } else {
                    str.append(strArr[i]).append(" ");
                }
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        reverseWords(s);
    }

}
