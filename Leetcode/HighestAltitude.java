// https://leetcode.com/problems/find-the-highest-altitude/

import java.util.Arrays;

public class HighestAltitude {

    static int largestAltitude(int[] gain) {
        for (int i = 1; i < gain.length; i++) {
            gain[i] = gain[i] + gain[i - 1];
        }

        System.out.println(Arrays.toString(gain));

        int max = Integer.MIN_VALUE;

        for (int j = 0; j < gain.length; j++) {
            if (gain[j] > max) {
                max = gain[j];
            }
        }

        if (max < 0) {
            return 0;
        } else {
            return max;
        }

    }

    public static void main(String[] args) {
        int[] nums = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(nums));
    }
}
