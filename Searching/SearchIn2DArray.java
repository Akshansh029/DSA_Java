
import java.util.Arrays;

public class SearchIn2DArray {

    static int[] searchIn2DArray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] arr = {{21, 65, 23, 4, 57}, {32, 76, 24, 35, 12}, {17, 61, 90, 84, 43}};
        int target = 17;
        int[] ans = searchIn2DArray(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
