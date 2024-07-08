package JavaBasics;

public class oddSumEvenSum {

    public static int even_odd(int[] A) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                evenSum += A[i];
            } else if (A[i] % 2 != 0) {
                oddSum += A[i];
            }
        }
        return (evenSum - oddSum);
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 2, 9, 0, 2};
        System.out.println(even_odd(arr));
    }
}
