package JavaBasics;

import java.util.Scanner;

public class Arrays2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initialization of 2D array
        int[][] arr1 = {
            {23, 63, 13},
            {34, 75},
            {67, 96, 24, 6, 4, 11}
        };

        //Or
        int rows = 3;
        int cols = 4;
        int[][] arr2 = new int[rows][cols]; //by default all the elements will be initialized as 0.

        //Accessing the elements
        System.out.println(arr1[0][2]);
        System.out.println(arr1[2][4]);

        //Printing the elements
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        //Taking input for 2D arrays
        int rows3 = 2;
        int cols3 = 4;
        int[][] arr3 = new int[rows3][cols3];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
