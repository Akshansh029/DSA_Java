// Find duplicate of the elements in the array using Bitwise operations

public class DuplicateInArray {

    static int duplicateElement(int[] arr) {
        int unique = 0;

        for (int i : arr) {
            unique ^= i;
        }

        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 3, 5, 9, 2, 1};
        System.out.println(duplicateElement(arr));
    }
}
