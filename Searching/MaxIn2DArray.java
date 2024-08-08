
public class MaxIn2DArray {

    static int maxIn2DArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {{21, 65, 23, 4, 57}, {32, 76, 24, 35, 12}, {17, 61, 90, 84, 99}};
        int ans = maxIn2DArray(arr);
        System.out.println(ans);
    }
}
