
import java.util.Arrays;

public class SelectionSort {

    static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            // find maximum element and swap with the last element
            int last = arr.length - i - 1;
            int max = maxIndex(arr, 0, last);

            // swapping the largest element with the last element
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }

        return arr;
    }

    static int maxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
