
public class ReduceToZero {

    static int reduceToZero(int num) {
        // if (num == 0) {
        //     return 0;
        // }

        // int count = 0;
        // while (num > 0) {
        //     if (num % 2 == 0) {
        //         num /= 2;
        //         count++;
        //     } else {
        //         num -= 1;
        //         count++;
        //     }
        // }
        // return count;
        return helper(num, 0);
    }

    static int helper(int num, int c) {
        if (num == 0) {
            return c;
        }

        if (num % 2 == 0) {
            return helper(num / 2, c + 1);
        } else {
            return helper(num - 1, c + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(reduceToZero(8));
    }
}
