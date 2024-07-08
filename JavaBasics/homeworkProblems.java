package JavaBasics;

import java.util.Scanner;

public class homeworkProblems {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Problem-1: Given an integer N, generate & print an array containing squares of all numbers from 1 to N
        // System.out.print("Enter the num: ");
        // int num = sc.nextInt();
        // int[] arr = new int[num];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = (i + 1) * (i + 1);
        // }
        // for (int j = 0; j < arr.length; j++) {
        //     System.out.println(arr[j]);
        // }
        //Problem-2: Read two arrays from the user and generate a third array containing all the common elements from the first two.
        // System.out.print("Enter the size of the first array: ");
        // int arr1Size = sc.nextInt();
        // int[] arr1 = new int[arr1Size];
        // for (int i = 0; i < arr1.length; i++) {
        //     arr1[i] = sc.nextInt();
        // }
        // System.out.print("Enter the size of the second array: ");
        // int arr2Size = sc.nextInt();
        // int[] arr2 = new int[arr2Size];
        // for (int i = 0; i < arr2.length; i++) {
        //     arr2[i] = sc.nextInt();
        // }
        // System.out.println("The common elements are: ");
        // for (int i = 0; i < arr1.length; i++) {
        //     for (int j = 0; j < arr2.length; j++) {
        //         if (arr1[i] == arr2[j]) {
        //             System.out.println(arr1[i]);
        //         }
        //     }
        // }
        //Problem-3: Given an array, find the maximum and the minimum elements in it.
        // int minNum = Integer.MAX_VALUE;
        // int maxNum = Integer.MIN_VALUE;
        // System.out.print("Enter the size of the array: ");
        // int num = sc.nextInt();
        // int[] arr = new int[num];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        //     maxNum = Math.max(arr[i], maxNum);
        //     minNum = Math.min(arr[i], minNum);
        // }
        // System.out.println("The maximum integer in the array is " + maxNum);
        // System.out.println("The minimum integer in the array is " + minNum);
        //Problem-4: Reverse of an array
        System.out.print("Enter the size of the array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int temp;
        for (int j = 0; j < arr.length / 2; j++) {
            temp = arr[j];
            arr[j] = arr[arr.length - 1 - j];
            arr[arr.length - 1 - j] = temp;
        }

        System.out.print("Reversed array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
