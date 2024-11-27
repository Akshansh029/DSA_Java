
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
// Example 1:
// Input: x = 123
// Output: 321
public class ReverseInteger {

    // static long fact = 1;
    // static ArrayList<Long> ans = new ArrayList<>();
    // static ArrayList<Long> factorialNumbers(long n) {
    //     for (int i = 1; i <= n; i++) {
    //         if (factorial(i) <= n) {
    //             ans.add((long) i);
    //         } else {
    //             break;
    //         }
    //     }
    //     return ans;
    // }
    // static long factorial(int num) {
    //     if (num == 0) {
    //         return fact;
    //     }
    //     fact *= num;
    //     return factorial(--num);
    // }
    static void reverseArray(int arr[]) {
        helper(arr, arr.length - 1);
    }

    static void helper(int[] arr, int i) {
        if (i < 0) {
            return;
        }

        System.out.print(arr[i] + " ");
        helper(arr, --i);
    }

    public static void main(String[] args) {
        // System.out.println(factorial(5));
        // System.out.println(factorialNumbers(26));
        int[] arr = {1, 2, 3, 4};
        reverseArray(arr);
    }
}
