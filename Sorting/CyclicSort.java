
import java.util.Arrays;

public class CyclicSort {

    static void cyclicSort(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            // if (i != arr[i] - 1) {
            //     int temp = arr[i];
            //     arr[i] = arr[correct];
            //     arr[correct] = temp;
            // } else {
            //     i++;
            // }
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 7, 3, 10, 8, 1, 9, 6};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
