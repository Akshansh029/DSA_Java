// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/

public class Leetcode1217 {

    static int minCostToMoveChips(int[] position) {
        int cost = 0;
        // int indexToStack = countInt(position);
        int indexToStack = position.length / 2;
        System.out.printf("The index to stack is %d", indexToStack);

        for (int k = 0; k < position.length; k++) {
            if (position[k] != indexToStack && (Math.abs(position[k] - indexToStack) % 2 != 0)) {
                cost++;
            }
        }
        System.out.println();
        return cost;
    }

    static int countInt(int[] arr) {
        int n = arr.length;
        int max_count = 0;
        int maxfreq = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > max_count) {
                max_count = count;
                maxfreq = arr[i];
            }
        }

        return maxfreq;
    }

    public static void main(String[] args) {
        int[] position = {6, 4, 7, 8, 2, 10, 2, 7, 9, 7};
        System.out.println(minCostToMoveChips(position));
    }
}
