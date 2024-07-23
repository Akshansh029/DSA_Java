
import java.util.Scanner;

public class rotateArray {

    static void rotateArrayByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        for (int element : ans) {
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
