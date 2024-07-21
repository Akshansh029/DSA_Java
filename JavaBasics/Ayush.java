package JavaBasics;

// package JavaBasics;
import java.util.Scanner;

public class Ayush {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initialization
        int[] arr = new int[5]; //With size

        int[] arr1 = {45, 23, 76, 23, 87}; //With data

        //Taking input in array
        System.out.print("Enter the size of the array: ");
        int inputSize = sc.nextInt();

        sc.nextLine();

        String[] names = new String[inputSize];
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        //Printing the array indexes
        System.out.println("The values of the names array are:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
