// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

class LeetCode268 {

    static int missingNumber(int[] nums) {
        int N = nums.length;
        int i = 0;
        while (i < N) {
            int correct = nums[i];

            if (i == nums[i] || nums[i] >= N) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }

        // Search for first missing number
        for (int j = 0; j < N; j++) {
            if (nums[j] != j) {
                return j;
            }
        }

        // Case 2: N is not in the array. eg: {0, 1}
        return N;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
}
