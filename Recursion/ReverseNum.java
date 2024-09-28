
public class ReverseNum {

    // Not a pure method as we are using external variable
    static int sum = 0;

    static void reverseNum1(int n) {
        if (n == 0) {
            return;
        }
        sum = sum * 10 + (n % 10);
        reverseNum1(n / 10);
    }

    static int reverseNum2(int n) {
        // To reverse num without using ext variable, we have to pass additional variable in arguments
        // In that case we make helper function
        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    public static void main(String[] args) {
        int num = 1824; // 4281
        // reverseNum1(num);
        // System.out.println(sum);
        System.out.println(reverseNum2(num));
    }
}
