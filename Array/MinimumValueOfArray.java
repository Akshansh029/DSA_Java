// package Array;

public class MinimumValueOfArray {

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        int[] myArray = {34, 85, 24, 97, 63, 86, 13, 45};
        System.out.println(MinimumValueOfArray.minValue(myArray));
    }
}
