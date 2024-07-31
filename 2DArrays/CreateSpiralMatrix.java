
import java.util.Scanner;

public class CreateSpiralMatrix {

    static void print2DArray(int[][] arr) {
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }

    static void createSpiralMatrix(int n) {
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int totalElements = 1;
        int[][] arr = new int[n][n];
        while (totalElements <= n * n) {
            for (int i = leftCol; i <= rightCol; i++) {
                arr[topRow][i] = totalElements++;
            }
            topRow++;

            for (int i = topRow; i <= bottomRow; i++) {
                arr[i][rightCol] = totalElements++;
            }
            rightCol--;

            for (int i = rightCol; i >= leftCol; i--) {
                arr[bottomRow][i] = totalElements++;
            }
            bottomRow--;

            for (int i = bottomRow; i >= topRow; i--) {
                arr[i][leftCol] = totalElements++;
            }
            leftCol++;
        }

        print2DArray(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int num = sc.nextInt();
        createSpiralMatrix(num);
    }
}
