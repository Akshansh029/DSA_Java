// package TwoPointer;
//Given an array of integers 'a', move all the even integers at the beginning of the array followed by all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies the condition

public class SortOddsAndEvens {

    static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    static int[] sortOddEven(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {11, 56, 24, 97, 24, 13, 57, 98, 75};
        System.out.println("Original array: ");
        printArray(arr);
        System.out.println();
        sortOddEven(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}
