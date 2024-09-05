// package Array;

import java.util.Arrays;

public class ZeroesAtEnd {

    public static int[] zeroesaAtEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[j] == 0 && arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] myArr = {23, 3, 0, 35, 0, 0, 13, 68, 0};
        int[] newArray = ZeroesAtEnd.zeroesaAtEnd(myArr);
        System.out.println(Arrays.toString(newArray));
    }
}
