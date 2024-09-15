
// You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
public class ShuffleString {

    static String restoreString(String s, int[] indices) {
        String ans = "";

        for (int i = 0; i < indices.length; i++) {
            int index = search(indices, i);
            ans += s.charAt(index);
        }

        return ans;
    }

    static int search(int[] arr, int target) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));
    }
}
