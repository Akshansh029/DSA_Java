//Check if we can partition the array into two subarrays with equal sum. More formally, check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array.

public class EqualSubArrayPrefixSum {

    static int totalSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static boolean checkEqualSubArray(int[] arr) {
        int total = totalSum(arr);

        int pref = 0;
        for (int i = 0; i < arr.length; i++) {
            pref += arr[i];
            int suff = total - pref;
            if (suff == pref) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 4, 7, 1, 6};
        System.out.println(checkEqualSubArray(arr));
    }
}
