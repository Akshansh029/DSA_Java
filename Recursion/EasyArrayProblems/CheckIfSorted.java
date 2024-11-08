
public class CheckIfSorted {

    static boolean ifSortedArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    static boolean ifSortedRecursion(int[] arr, int start) {
        if (start == arr.length - 1) {
            return true;
        }
        // Using ternary operator
        // return arr[start] > arr[start + 1] ? false : ifSortedRecursion(arr, start + 1);

        if (arr[start] > arr[start + 1]) {
            return false;
        }
        return ifSortedRecursion(arr, start + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 12, 14, 18, 19, 122};
        // System.out.println(ifSortedArray(arr));
        System.out.println(ifSortedRecursion(arr, 0));
    }
}
