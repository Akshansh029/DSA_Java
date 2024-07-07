package JavaBasics;

import java.util.Scanner;

public class sumOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int num;
        do {
            num = sc.nextInt();
            total = total + num;
        } while (num >= 0);
        System.out.println(total);
    }
}
