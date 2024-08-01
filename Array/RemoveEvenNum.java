// package Array;

import java.util.Arrays;

public class RemoveEvenNum {

    public static void removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] newArr = new int[oddCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                newArr[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String args[]) {
        int[] array = {23, 64, 1, 57, 32, 54, 97, 17};
        RemoveEvenNum.removeEven(array);
    }
}
