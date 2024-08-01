
import java.util.Scanner;

public class SumOfRangePrefixSum {

    static void print2DArray(int[][] arr) {
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] create2DArray(int r, int c) {
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = (int) Math.floor(Math.random() * 10);
            }
        }
        return arr;
        // print2DArray(arr);
    }

    static void prefixSum2dArray(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
        print2DArray(arr);
    }

    static void sumOf2dArray(int[][] arr, int l1, int r1, int l2, int r2) {
        int sum = 0;
        prefixSum2dArray(arr);

        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1) {
                sum += arr[i][r2] - arr[i][r1 - 1];
            } else {
                sum += arr[i][r2];
            }
        }
        System.out.println("Sum of reactangle: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter cols: ");
        int cols = sc.nextInt();
        int[][] arr = create2DArray(rows, cols);
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        sumOf2dArray(arr, l1, r1, l2, r2);
    }
}
