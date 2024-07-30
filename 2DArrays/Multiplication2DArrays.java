// package 2DArrays;

public class Multiplication2DArrays {

    static void print2DArray(int[][] arr) {
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply2DArrays(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplcation of these matrices is not possible");
            return;
        }

        int[][] arr3 = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        print2DArray(arr3);
    }

    public static void main(String[] args) {
        int[][] arr1 = {{2, 5, 8}, {8, 2, 7}};
        int[][] arr2 = {{6, 3}, {9, 1}, {5, 7}};
        print2DArray(arr1);
        print2DArray(arr2);
        multiply2DArrays(arr1, 2, 3, arr2, 3, 2);
    }
}
