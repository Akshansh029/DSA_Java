// https://leetcode.com/problems/first-missing-positive/description/

// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums. You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
public class Leetcode41 {

    static int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            int correct = nums[i] - 1;

            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 11, 12};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }
}
