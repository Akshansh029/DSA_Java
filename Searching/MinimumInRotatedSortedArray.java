
public class MinimumInRotatedSortedArray {

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

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int[] arr1 = {8, 9, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(minimumInRotatedSortedArray(arr));
        System.out.println(minimumInRotatedSortedArray(arr1));
    }
}
