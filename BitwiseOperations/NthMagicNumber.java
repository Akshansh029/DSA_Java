// https://www.geeksforgeeks.org/problems/magic-number4431/1

// A magic number is defined as a number that can be expressed as a power of 5 or sum of unique powers of 5. First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), …
// Given the value of n, find the n'th Magic number modulo 109+7.
public class NthMagicNumber {

    static long nthMagicNo(int n) {
        long sum = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            sum += last * base;
            base *= 5;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(nthMagicNo(n));
    }
}
