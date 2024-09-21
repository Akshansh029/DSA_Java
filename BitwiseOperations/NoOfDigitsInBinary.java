// Calculates the number of digits in the binary representation of a given number (num).
// Time complexity is O(logn);

public class NoOfDigitsInBinary {

    public static void main(String[] args) {
        int num = 18;
        int base = 2;

        int digits = (int) (Math.log(num) / Math.log(base)) + 1;
        System.out.println(digits);
    }
}
