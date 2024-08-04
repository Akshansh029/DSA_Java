
// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val. Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things: Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums. Return k.
public class RemoveElement {

    static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int k = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = Integer.MAX_VALUE;
                k--;
            }
        }

        int n = nums.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        printArray(nums);
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 8, 1, 5, 1, 9};
        removeElement(arr, 1);
    }
}
