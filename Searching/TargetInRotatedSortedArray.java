
public class TargetInRotatedSortedArray {

    static int minimumInRotatedSortedArray(int[] arr) {
        int ans = -1;
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[n - 1]) {
                start = mid + 1;
            } else if (arr[mid] <= arr[n - 1]) {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int targetInRotatedSortedArray(int[] arr, int target) {
        int pivot = minimumInRotatedSortedArray(arr);

        int ans;
        if (binarySearch(arr, target, 0, pivot - 1) == -1) {
            ans = binarySearch(arr, target, pivot, arr.length);
        } else {
            ans = binarySearch(arr, target, 0, pivot - 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        int[] arr1 = {8, 9, 1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {5, 1, 2, 3, 4};
        int[] arr3 = {0, 0, 0, 1, 1, 2, 0, 0, 3, 4};
        System.out.println(targetInRotatedSortedArray(arr, 2));
        System.out.println(targetInRotatedSortedArray(arr1, 1));
        System.out.println(targetInRotatedSortedArray(arr2, 4));
        System.out.println(targetInRotatedSortedArray(arr3, 3));
    }
}
