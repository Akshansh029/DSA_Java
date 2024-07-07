package JavaBasics;

import java.util.Scanner;

public class scannerClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Integer input
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println(x);

        //String input
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.println(s);

        //boolean input 
        System.out.print("Enter the boolean: ");
        Boolean b = sc.nextBoolean();
        System.out.println(b);

        //Like this we can take input for byte, long, float, double etc
        //For char input there is no function in the scanner class
        System.out.print("Enter the char: ");
        char c = sc.next().charAt(0);
        System.out.println(c);
    }
}
