
import java.util.Arrays;

public class BubbleSort {

    static int[] bubbleSort(int[] arr) {
        int N = arr.length;
        boolean swapped;

        // Run the steps N - 1 times
        for (int i = 0; i < N; i++) {
            swapped = false; // Checking if swapping occured or not

            // For each step largest element will come at last index
            for (int j = 1; j < N - i; j++) {

                // swap if arr[j] is smaller than arr[j-1]
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }

            // Break if the array is already sorted based on the boolean
            if (!swapped) {
                break;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 4, 3, 6};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
