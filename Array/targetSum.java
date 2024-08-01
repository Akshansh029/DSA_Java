//Find the total number of pairs in the Array whose sum is equal to the given value x.

import java.util.Scanner;

public class targetSum {

    //Brute force
    static int pairFinder(int[] arr, int num) {
        int pairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 6, 3, 5, 8, 2};
        int num = sc.nextInt();
        int ans = pairFinder(arr, num);
        System.out.println(ans);
    }
}
