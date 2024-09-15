
public class MinMaxUsingRecursion {

    static int minElement(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        return Math.min(arr[n - 1], minElement(arr, n - 1));
    }

    static int maxElement(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        return Math.max(arr[n - 1], maxElement(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int n = arr.length;
        System.out.println(minElement(arr, n));
        System.out.println(maxElement(arr, n));
    }
}
