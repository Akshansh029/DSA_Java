// Given an array of integers of size n. Answer q queries where you need to print the sum of values in a given range of indices from I to r (both included). The values ofl and r in queries follow I-based indexing.

import java.util.Scanner;

public class QueryPrefixSum {

    static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static int[] prefixSumOfArray(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 7, 3, 5, 9, 8, 1};

        int[] pref = prefixSumOfArray(arr);
        printArray(pref);

        System.out.print("Enter the number of queries: ");
        int queries = sc.nextInt();

        while (queries > 0) {
            System.out.print("Enter the range for the query: ");
            int start = sc.nextInt();
            int end = sc.nextInt();
            int ans = pref[end] - pref[start - 1];
            System.out.println("Sum: " + ans);
            queries--;
        }
    }
}
