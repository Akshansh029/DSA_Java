
import java.util.Scanner;

public class BSIn2DArrays {

    public static int[] bsIn2DArray(int[][] arr, int target) {
        if (arr == null || arr.length == 0) {
            return new int[]{-1, -1};
        }

        int row = 0;
        int col = arr.length - 1;

        while (row < arr.length && col > 0) {
            if (target < arr[row][col]) {
                col--;
            } else if (target > arr[row][col]) {
                row++;
            } else {
                return new int[]{row, col};
            }
        }
        return new int[]{-1, -1};

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter target value: ");
        int target = sc.nextInt();

        System.out.println("Resultant matrix is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int ans[] = bsIn2DArray(arr, target);
        System.out.print("Position of the target is :");
        for (int i : ans) {
            System.out.print(i + " ");
        }

    }
}
