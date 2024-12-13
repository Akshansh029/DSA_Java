// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

public class LongestSubArrayCount {

    public static int lenOfLongestSubarr(int[] arr, int k) {
        int count;
        int max = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count = j - i + 1;
                    max = Math.max(max, count);
                }
            }
            sum = 0;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {94, -33, -13, 40, -82, 94, -33, -13, 40, -82};
        System.out.println(lenOfLongestSubarr(arr, 52));
    }

}
