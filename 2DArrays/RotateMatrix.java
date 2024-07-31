// Given a square matrix, turn it by 90 degrees in a clockwise direction without using any extra space.

public class RotateMatrix {

    static void print2DArray(int[][] arr) {
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverseArray(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    static void inplaceTranspose(int[][] arr, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void rotateMatrix(int[][] arr) {
        inplaceTranspose(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            reverseArray(arr[i]);
        }

        print2DArray(arr);
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println("Original array: ");
        print2DArray(arr);
        System.out.println("Rotated array: ");
        rotateMatrix(arr);
    }
}
