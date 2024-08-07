
public class SearchInRange {

    static int linearSearchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {12, 6, 5, 8, 79, 3, 8, 78, 443, 24, 86, 4, 2, 32, 67, 68};
        int target = 24;
        int ans = linearSearchInRange(nums, target, 2, 10);
        System.out.println("Index of " + target + ": " + ans
        );
    }
}
