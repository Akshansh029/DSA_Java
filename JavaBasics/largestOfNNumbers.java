// package JavaBasics;

import java.util.Scanner;

public class largestOfNNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the input: ");
        int N = sc.nextInt();
        int maxValue = Integer.MIN_VALUE;

        for (int i = 1; i <= N; i++) {
            int J = sc.nextInt();
            maxValue = Math.max(J, maxValue);

        }
        System.out.println(maxValue);
    }
}
