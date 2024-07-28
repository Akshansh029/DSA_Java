// package TwoPointer;

public class PrefixSum {

    static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    static int[] prefixSumOfArray(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {11, 56, 24, 97, 24, 13, 57, 98, 75};
        System.out.println("Original array: ");
        printArray(arr);
        System.out.println();
        int[] ans = prefixSumOfArray(arr);
        System.out.println("Prefix sum array: ");
        printArray(ans);
    }
}
