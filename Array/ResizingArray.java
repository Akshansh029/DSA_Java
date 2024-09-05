// package Array;

import java.util.Arrays;

public class ResizingArray {

    public static int[] resizeArray(int[] arr, int cacpacity) {
        int[] temp = new int[cacpacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public static void main(String args[]) {
        int[] myArr = {1, 2, 3};
        System.out.println(Arrays.toString(ResizingArray.resizeArray(myArr, 10)));
    }
}
