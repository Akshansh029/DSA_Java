// package Array;

public class ArraySearch {

    public static void searchArray(int[] arr, int num) {
        boolean isNum = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                isNum = true;
            } else {
                isNum = false;
            }
        }
        System.out.println(isNum);
    }

    public static void main(String args[]) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArraySearch.searchArray(intArray, 46);
    }
}
