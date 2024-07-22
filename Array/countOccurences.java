// package Array;

public class countOccurences {

    static int countInt(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 7, 2, 7, 6, 9, 3, 2, 7, 2, 1};
        int count = countInt(arr1, 3);
        System.out.printf("The number of times 3 occured: %d", count);
    }
}
