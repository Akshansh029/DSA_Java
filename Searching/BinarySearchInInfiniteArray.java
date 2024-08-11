
public class BinarySearchInInfiniteArray {

    static int binarySearchInInfiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int tempStart = end + 1;

            // end = previousEnd + boxSize * 2;
            end = end + (end - start + 1) * 2;
            start = tempStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            // int mid = (start + end) / 2; start + end value can exceed int limit
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //Mid is the target element
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 67, 78, 89, 90};
        int target = 91;
        System.out.println("The required answer is " + binarySearchInInfiniteArray(arr, target));
    }
}
