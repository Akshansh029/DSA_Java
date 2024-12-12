// LeetCode 1903
// https://leetcode.com/problems/largest-odd-number-in-string/

public class LargestOddNumInString {

    public static String largestOddNumber(String num) {
        // int n = Integer.parseInt(num);
        // if (n % 2 != 0) {
        //     return num;
        // }

        for (int i = num.length() - 1; i >= 0; i--) {
            int ch = (int) num.charAt(i) - '0';
            if (ch % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("3526768"));
        System.out.println(largestOddNumber("3526768"));
    }
}
