// package Searching;

public class LinearSearch {

    // Search in the array: return the item if found
    // Return -1 if the item is not found
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {12, 6, 5, 8, 79, 3, 8, 78, 443, 24, 86, 4, 2, 32, 67, 68};
        int target = 32;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
}
