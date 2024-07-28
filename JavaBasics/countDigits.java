// package JavaBasics;

import java.util.Scanner;

public class countDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your integer: ");
        int num = sc.nextInt();
        int i = 0;

        while (num > 0) {
            num /= 10;
            i++;
        }
        System.out.println(i);
    }
}
