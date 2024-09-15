
public class BSUsingRecursion {

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }

        return search(arr, target, m + 1, e);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 10, 35, 68, 89};
        int ans = search(arr, 68, 0, arr.length - 1);
        System.out.println(ans);
    }
}
