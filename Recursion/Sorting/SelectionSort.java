
import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] arr, int last) {
        if (last == 0) {
            return;
        }
        int max = maxIndex(arr, last, 0);

        int temp = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;

        selectionSort(arr, last - 1);
    }

    static int maxIndex(int[] arr, int index, int max) {
        if (index == 0) {
            return max;
        }
        if (arr[index] > arr[max]) {
            max = index;
        }

        return maxIndex(arr, index - 1, max);
    }

    public static void main(String[] args) {
        int[] arr = {32, 2, 686, 8, 144};
        System.out.println(maxIndex(arr, arr.length - 1, 0));

        selectionSort(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
