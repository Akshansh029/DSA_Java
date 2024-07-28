
public class SortArrayOf0sAnd1s {

    static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    // Usual method for solving this ques
    // static int[] sortZeroesAndOnes(int[] arr) {
    //     int countZeroes = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == 0) {
    //             countZeroes++;
    //         }
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         if (i < countZeroes) {
    //             arr[i] = 0;
    //         } else {
    //             arr[i] = 1;
    //         }
    //     }
    //     return arr;
    // }
    // Using two pointers to solve
    static int[] sortZeroesAndOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 0, 1, 0, 1};
        System.out.println("Original array: ");
        printArray(arr);
        System.out.println();
        sortZeroesAndOnes(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}
