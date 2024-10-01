
public class CountZeroes {

    static int countZeroes(int num) {
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 0) {
                count++;
            }
            num /= 10;
        }

        return count;
    }

    static int countZeroesUsingRecursion(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int c) {
        if (num == 0) {
            return c;
        }

        if (num % 10 == 0) {
            return helper(num / 10, c + 1);
        }
        return helper(num / 10, c);
    }

    public static void main(String[] args) {
        int num = 403002;
        // System.out.println(countZeroes(num));
        System.out.println(countZeroesUsingRecursion(num));
    }
}
