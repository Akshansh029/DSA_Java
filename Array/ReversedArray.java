
public class ReversedArray {

    public static void reverseArray(int[] arr) {
        // while (start < end) {
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;
        //     end--;
        // }
        // System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void main(String args[]) {
        int[] arr = {2, 62, 5, 68, 3, 42, 46, 68, 3, 53, 68, 798, 13};
        // ReversedArray.reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr);
    }
}
