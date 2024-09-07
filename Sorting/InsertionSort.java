
import java.util.Arrays;

public class InsertionSort {

    static int[] insertionSort(int[] arr) {
        int N = arr.length;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {

                    // If jth element is smaller than (j-1)th element, swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {

                    // If the left side of j is sorted break internal loop
                    break;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        int[] ans = insertionSort(arr);
        System.out.println(Arrays.toString(ans));
    }
}
