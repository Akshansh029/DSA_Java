// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description

// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
import java.util.ArrayList;
import java.util.List;

public class LeetCode448 {

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int N = nums.length;
        int i = 0;
        List<Integer> ans = new ArrayList<>();

        while (i < N) {
            int correct = nums[i] - 1;

            if (nums[correct] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        // Find missing number and add in the list
        for (int j = 0; j < N; j++) {
            if (nums[j] != j + 1) {
                ans.add(j + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }
}
