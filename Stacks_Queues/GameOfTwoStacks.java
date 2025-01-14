// https://www.hackerrank.com/challenges/game-of-two-stacks/problem

import java.util.Arrays;
import java.util.Scanner;

public class GameOfTwoStacks {

    public static int twoStacks(int maxSum, int[] a, int[] b) {
        return twoStacks(maxSum, a, b, 0, 0) - 1;
    }

    public static int twoStacks(int maxSum, int[] a, int[] b, int sum, int count) {
        if (sum > maxSum) {
            return count;
        }
        if (a.length == 0 || b.length == 0) {
            return count;
        }

        int ans1 = twoStacks(maxSum, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(maxSum, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);
        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of games: ");
        int g = sc.nextInt();
        System.out.print("Enter the size of both stacks and max sum: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int maxSum = sc.nextInt();
        int[] a = new int[m];
        System.out.print("Enter array 1: ");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        System.out.print("Enter array 2: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int ans = twoStacks(maxSum, a, b);
        System.out.println("Maximum possible score: " + ans);

    }
}
