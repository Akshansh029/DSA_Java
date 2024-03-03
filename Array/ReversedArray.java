package Array;
import java.util.Arrays;
public class ReversedArray {
    public static void reverseArray(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]){
        int[] arr = {2,62,5,68,3};
        ReversedArray.reverseArray(arr,0,arr.length-1);
    }
}
