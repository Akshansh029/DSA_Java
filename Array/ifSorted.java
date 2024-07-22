
public class ifSorted {

    static boolean sortedArray(int[] arr) {
        boolean ans = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {45, 13, 76, 43, 87};
        boolean ans = sortedArray(arr);
        System.out.println(ans);
    }
}
