
import java.util.ArrayList;

public class EasyArrayProblems {

    static boolean sorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    static boolean sortedRecursion(int[] arr, int start) {
        if (start == arr.length - 1) {
            return true;
        }
        // Using ternary operator
        // return arr[start] > arr[start + 1] ? false : sortedRecursion(arr, start + 1);

        if (arr[start] > arr[start + 1]) {
            return false;
        }
        return sortedRecursion(arr, start + 1);
    }

    static int linearSearch(int[] arr, int index, int target) {
        if (index > arr.length - 1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }
        return linearSearch(arr, index + 1, target);

    }

    // a static new Arraylist can be created outside the method to store indices of target.
    // But if we don't create a new Arraylist we can pass it in arguments and create new one during func call in main func.
    static ArrayList<Integer> multipleLinearSearch(int[] arr, int index, int target, ArrayList<Integer> list) {

        if (index > arr.length - 1) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        return multipleLinearSearch(arr, index + 1, target, list);

    }

    //  If we want to make a method which doesn't take list as an argument, then
    // we have to add a clause that takes the ans of the previous recursive func calls
    // and adds them to the list created in the method.
    static ArrayList<Integer> multipleLinearSearch2(int[] arr, int index, int target) {
        // Not very optimised as new object creates again and again
        ArrayList<Integer> list = new ArrayList<>();

        if (index > arr.length - 1) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromPrevCalls = multipleLinearSearch2(arr, index + 1, target);

        list.addAll(ansFromPrevCalls);

        return list;
    }

    static int searchRotatedSortedArray(int[] arr, int key, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;

        if (arr[m] == key) {
            return m;
        }

        if (arr[s] <= arr[e]) {
            if (key <= arr[m] && key >= arr[s]) {
                return searchRotatedSortedArray(arr, key, s, m - 1);
            } else {
                return searchRotatedSortedArray(arr, key, m + 1, e);
            }
        }

        if (key > arr[m] && key <= arr[e]) {
            return searchRotatedSortedArray(arr, key, m + 1, e);
        } else {
            return searchRotatedSortedArray(arr, key, s, m - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {18, 12, 14, 18, 19, 18, 122};
        int[] arr1 = {5, 6, 7, 1, 2, 3, 4};
        // System.out.println(sorted(arr));
        // System.out.println(sortedRecursion(arr, 0));
        // System.out.println(linearSearch(arr, 0, 14));
        // System.out.println(multipleLinearSearch(arr, 0, 18, new ArrayList<>()));
        System.out.println(multipleLinearSearch2(arr, 0, 18));
        System.out.println(searchRotatedSortedArray(arr1, 2, 0, arr.length - 1));
    }
}
