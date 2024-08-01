//Given a matrix 'a' of dimension n x m and 2 coordinates (11, rl) and (12, r2). Return the sum of the rectangle from (ll,rl) to (12, r2).

import java.util.Scanner;

public class SumOfRange {

    static void print2DArray(int[][] arr) {
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] Create2DArray(int r, int c) {
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = 1;
            }
        }

        return arr;
    }

    static void sumOf2dArray(int[][] arr, int l1, int r1, int l2, int r2) {
        int sum = 0;

        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += arr[i][j];
            }

        }

        System.out.println("Sum of reactangle: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter rows: ");
        int cols = sc.nextInt();
        int[][] arr = Create2DArray(rows, cols);
        print2DArray(arr);
        System.out.print("Enter first coordinate: ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.print("Enter second coordinate: ");
        int l2 = sc.nextInt();
        int c2 = sc.nextInt();
        sumOf2dArray(arr, l1, r1, l2, c2);
    }
}
