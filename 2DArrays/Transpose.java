
import java.util.Scanner;

public class Transpose {

    static void print2DArray(int[][] arr) {
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }

    static void inplaceTranspose(int[][] arr, int rows, int cols) {

        for (int i = 0; i < cols; i++) {
            for (int j = i; j < rows; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        print2DArray(arr);
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

        inplaceTranspose(arr1, rows, cols);
    }
}
