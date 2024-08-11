
public class TargetInRotatedSortedArray {

    static int targetInRotatedSortedArray(int[] arr, int target) {
        int ans = -1;
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[n - 1]) {
                start = mid + 1;
            } else if (arr[mid] < arr[n - 1]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        int[] arr1 = {8, 9, 1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {5, 1, 2, 3, 4};
        System.out.println(targetInRotatedSortedArray(arr, 2));
        System.out.println(targetInRotatedSortedArray(arr1, 1));
        System.out.println(targetInRotatedSortedArray(arr2, 4));
    }
}
