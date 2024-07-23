//Find the unique number in a given Array where all the ele ents are being repeated twice with one value being unique.

public class uniqueNumber {

    static int findUniqueNumber(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                    break;
                }
            }
            if (arr[i] != -1) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 3, 5, 2, 5, 7, 3};
        int answer = findUniqueNumber(arr);
        System.out.println(answer);
    }
}
