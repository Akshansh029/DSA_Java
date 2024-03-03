package Array;

public class MissingNumInArray {
    public static int findNum(int[] arr){
        int n = arr.length+1;
        int total = (n*(n+1))/2;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return total-sum;
    }

    public static void main(String args[]){
        int[] myArr = {3,7,1,8,4,2,6,5,9,12,10};
        System.out.println(MissingNumInArray.findNum(myArr));
    }
}
