
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String newStr = removeChar(s);
        int l = 0;
        int r = newStr.length() - 1;

        while (l <= r) {
            if (newStr.charAt(l) != newStr.charAt(r)) {
                return false;
            } else {
                l++;
                r--;
            }
        }

        return true;
    }

    public static String removeChar(String s) {
        s = s.toLowerCase();
        String newStr = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                newStr += s.charAt(i);
            }
        }

        return newStr;
    }

    public static void main(String[] args) {
        boolean ans = isPalindrome(" ");
        System.out.println(ans);
    }
}
