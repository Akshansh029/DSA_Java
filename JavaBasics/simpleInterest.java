// package JavaBasics;

import java.util.Scanner;

public class simpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        int p = sc.nextInt();
        System.out.print("Enter the rate: ");
        int r = sc.nextInt();
        System.out.print("Enter the years: ");
        int n = sc.nextInt();

        int interest = (p * r * n) / 100;
        System.out.printf("The simple interest of the given details is %d", interest);

    }
}
