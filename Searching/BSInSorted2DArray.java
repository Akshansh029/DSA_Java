
import java.util.Arrays;

public class BSInSorted2DArray {

    static int[] normalBinarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        if (arr == null || arr.length == 0 || arr[row] == null || arr[row].length == 0) {
            return new int[]{-1, -1};
        }

        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (target < arr[row][mid]) {
                cEnd = mid - 1;
            }
            if (target > arr[row][mid]) {
                cStart = mid + 1;
            } else {
                return new int[]{row, mid};
            }
        }
        return new int[]{-1, -1};
    }

    static int[] bsInSorted2DArray(int[][] arr, int target) {
        if (arr == null || arr.length == 0) {
            return new int[]{-1, -1};
        }

        int rows = arr.length;
        int cols = arr[0].length; // be cautious the arr is not empty

        // If there is only 1 row, apply normal binary search
        if (rows == 0) {
            return normalBinarySearch(arr, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run loop till 2 rows are remaining
        while (rStart < rEnd - 1) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (arr[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (arr[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we have 2 rows
        // Check whether target is in the col of 2 rows
        if (arr[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (arr[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Check in 1st half
        if (target <= arr[rStart][cMid - 1]) {
            return normalBinarySearch(arr, rStart, 0, cMid - 1, target);
        }
        // Check in 2nd half
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]) {
            return normalBinarySearch(arr, rStart, cMid + 1, cols - 1, target);
        }
        // Check in 3rd half
        if (target <= arr[rStart + 1][cMid - 1]) {
            return normalBinarySearch(arr, rStart + 1, 0, cMid - 1, target);
        } // Check in 4th half
        else {
            return normalBinarySearch(arr, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3,},
            {4, 5, 6},
            {7, 8, 9},};
        System.out.println(Arrays.toString(bsInSorted2DArray(arr, 2)));
    }
}
