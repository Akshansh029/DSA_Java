
public class SecondMaxValue {

    public static int secondMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String args[]) {
        int[] myArray = {24, 76, 35, 75, 14, 85, 32, 95};
        System.out.printf("The minimum value of the array is %d", SecondMaxValue.secondMaxValue(myArray));
    }
}
