
public class HappyNumber {

    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }

        n = findSquare(n);
    }

    public static int findSquare(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findSquare(124));
    }
}
