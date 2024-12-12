
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
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    static void rotate(int[] arr, int k) {
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
        int[] arr = {0, 1, 2, 3, 4};
        rotate(arr, 2);
    }
}
