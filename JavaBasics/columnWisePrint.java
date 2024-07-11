package JavaBasics;

public class columnWisePrint {

    public static void main(String[] args) {

        int[][] arr = {
            {11, 22, 33},
            {44, 55, 66},
            {77, 88, 99}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println("Rows wise print");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Columns wise print");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
