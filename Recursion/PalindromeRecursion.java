
public class PalindromeRecursion {

    static boolean palindrome(String str) {
        // Base case: If length is 1 or lesser, return true
        if (str.length() <= 1) {
            return true;
        }

        // If first and last char are not equal, return false
        if (str.toLowerCase().charAt(0) != str.toLowerCase().charAt(str.length() - 1)) {
            return false;
        }

        return palindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(palindrome("malaylam"));
    }
}
