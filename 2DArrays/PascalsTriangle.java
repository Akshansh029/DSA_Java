
import java.util.Scanner;

public class PascalsTriangle {

    static void print2DArray(int[][] arr) {
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }

    static void pascalsTriangle(int n) {
        int[][] ans = new int[n][];

        for (int i = 0; i < ans.length; i++) {
            // ith row has i + 1 cols 
            ans[i] = new int[i + 1];
            // First and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;
            // Equation of filling the elements in Pascal' triangle
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j - 1] + ans[i - 1][j];
            }
        }

        print2DArray(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Pascal's triangle: ");
        int num = sc.nextInt();
        pascalsTriangle(num);
    }
}
