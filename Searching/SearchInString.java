
public class SearchInString {

    // true or false if element is present
    static boolean searchInString(String s, char c) {
        if (s.length() == 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String name = "Akshansh";
        char c = 'n';
        boolean ans = searchInString(name, c);
        System.out.println(ans);
    }
}
