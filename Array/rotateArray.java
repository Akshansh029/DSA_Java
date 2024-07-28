
import java.util.Scanner;

public class rotateArray {

    // Rotate array using extra space
    // static void rotateArrayByK(int[] arr, int k) {
    //     int n = arr.length;
    //     k = k % n;
    //     int[] ans = new int[n];
    //     int j = 0;
    //     for (int i = n - k; i < n; i++) {
    //         ans[j++] = arr[i];
    //     }
    //     for (int i = 0; i < n - k; i++) {
    //         ans[j++] = arr[i];
    //     }
    //     for (int element : ans) {
    //         System.out.print(element + " ");
    //     }
    // }
    static int[] reverseArray(int[] arr, int start, int end) {
        for (int i = start; i < end / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[end - 1 - i];
            arr[end - 1 - i] = temp;
        }

        return arr;
    }

    static void rotateArrayByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, n - k - 1);
        reverseArray(arr, n - k, n - 1);
        reverseArray(arr, 0, n - 1);

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = {2, 62, 5, 68, 3, 42, 46};
        rotateArrayByK(arr, k);
    }
}
