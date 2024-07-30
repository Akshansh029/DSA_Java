
import java.util.Scanner;

// package 2DArrays;
public class Addition2DArrays {

    static void print2DArray(int[][] arr) {
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] add2DArrays(int[][] arr1, int[][] arr2, int rows, int cols) {
        int[][] arr3 = new int[rows][cols];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return arr3;
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

        int[][] arr2 = new int[rows][cols];

        for (int[] arr11 : arr2) {
            for (int j = 0; j < arr11.length; j++) {
                arr11[j] = sc.nextInt();
            }
        }
        System.out.println("Second array: ");
        print2DArray(arr2);

        int[][] arr3 = add2DArrays(arr1, arr2, rows, cols);
        System.out.println("Resultant array: ");
        print2DArray(arr3);

    }
}
