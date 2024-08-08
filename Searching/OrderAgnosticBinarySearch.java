
public class OrderAgnosticBinarySearch {

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[end] > arr[start];

        while (start <= end) {
            // int mid = (start + end) / 2; start + end value can exceed int limit
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {90, 89, 78, 67, 56, 45, 34, 23, 12};
        int[] arr1 = {12, 23, 34, 45, 56, 67, 78, 89, 90};
        int target = 23;
        System.out.println("The required answer is " + orderAgnosticBinarySearch(arr, target));
        System.out.println("The required answer is " + orderAgnosticBinarySearch(arr1, target));
    }
}
