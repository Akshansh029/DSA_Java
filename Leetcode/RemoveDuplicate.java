
import java.util.Arrays;

public class RemoveDuplicate {

    static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return j;
    }

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 4, 4, 5};
        System.out.println(removeDuplicates(nums));
    }
}
