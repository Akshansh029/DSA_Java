
public class repeatingNumber {

    static int findRepeatedNumber(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[i];
                    break;
                }
            }
            if (ans != -1) {
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 9, 4, 2, 1, 0, 10, 9};
        int answer = findRepeatedNumber(arr);
        System.out.printf("Repeated number in the array is %d", answer);
    }
}
