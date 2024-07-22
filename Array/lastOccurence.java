
import java.util.Scanner;

public class lastOccurence {

    static int lastIndex(int[] arr, int num) {
        int lastIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                lastIndex = i;
            } else {
                lastIndex = -1;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 5, 2, 7, 5, 9, 3, 1, 2, 5, 8, 1};
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int ans = lastIndex(arr, num);
        System.out.printf("Last occurence of %d is %d", num, ans);
    }
}
