// package TwoPointer;
//Given an integer array 'a' sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

public class SortArrayOfSquares {

    static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    static int[] sortArraySquares(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int[] ans = new int[arr.length];
        int k = 0;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-8, -4, -1, 2, 6, 10, 12};
        printArray(arr);
        System.out.println();
        int[] ans = sortArraySquares(arr);
        printArray(ans);
    }
}
