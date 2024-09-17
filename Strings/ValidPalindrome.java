
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String newStr = removeChar(s);
        int l = 0;
        int r = newStr.length() - 1;

        while (l <= r) {
            if (newStr.charAt(l) != newStr.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    public static String removeChar(String s) {
        s = s.toLowerCase();
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                newStr.append(s.charAt(i));
            }
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        boolean ans = isPalindrome("a");

        System.out.println(ans);
    }
}
