// package JavaBasics;

import java.util.Scanner;

public class sumOfNNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 0;
        for (int i = 0; i <= num; i++) {
            total += i;
        }
        System.out.println(total);

    }
}
