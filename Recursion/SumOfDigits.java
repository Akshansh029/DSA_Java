// Ex. Find sum of digits of 1342 i.e. 1+3+4+2 = 10
// So, breaking it down, F(1342) = 1 + F(342), F(342) = 3 + F(42) etc
// Taking the last digit using remainder 1342 % 10 = 2
// Reducing the number N = N / 10;

public class SumOfDigits {

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1342));
    }
}
