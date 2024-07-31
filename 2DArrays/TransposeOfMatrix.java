
import java.util.Scanner;

public class TransposeOfMatrix {

    static void print2DArray(int[][] arr) {
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeOfMatrix(int[][] arr, int r, int c) {
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];
            }
        }

        print2DArray(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr1 = new int[rows][cols];

        for (int[] arr11 : arr1) {
            for (int j = 0; j < arr11.length; j++) {
                arr11[j] = sc.nextInt();
            }
        }
        System.out.println("First array: ");
        print2DArray(arr1);

        transposeOfMatrix(arr1, rows, cols);
    }
}
