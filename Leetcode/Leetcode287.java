// https://leetcode.com/problems/find-the-duplicate-number/description/

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and uses only constant extra space.
public class Leetcode287 {

    static int findDuplicate(int[] nums) {
        int N = nums.length;
        int i = 0;

        while (i < N) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        return nums[N - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }
}
