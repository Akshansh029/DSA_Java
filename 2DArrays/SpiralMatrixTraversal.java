
import java.util.Scanner;

public class SpiralMatrixTraversal {

    static void spiralMatrixTraversal(int[][] arr, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements = r * c;
        while (totalElements > 0) {
            for (int i = leftCol; i <= rightCol; i++) {
                System.out.print(arr[topRow][i] + " ");
                totalElements--;
            }
            topRow++;

            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalElements--;
            }
            rightCol--;

            for (int i = rightCol; i >= leftCol; i--) {
                System.out.print(arr[bottomRow][i] + " ");
                totalElements--;
            }
            bottomRow--;

            for (int i = bottomRow; i >= topRow; i--) {
                System.out.print(arr[i][leftCol] + " ");
                totalElements--;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int row = sc.nextInt();
        int cols = sc.nextInt();
        spiralMatrixTraversal(arr, row, cols);
    }
}
