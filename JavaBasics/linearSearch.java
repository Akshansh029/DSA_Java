package JavaBasics;

import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50, 60};

        int ans = -1;

        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
