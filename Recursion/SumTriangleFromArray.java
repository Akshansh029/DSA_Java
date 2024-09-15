
import java.util.Arrays;

// package Recursion;
public class SumTriangleFromArray {

    static void printTrianlge(int[] arr) {
        if (arr.length < 1) {
            return;
        }

        int[] temp = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }

        // Make recursive call to print the next array
        printTrianlge(temp);

        // If sout is above the recursive call it will print inverted triangle
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        printTrianlge(A);
    }
}
