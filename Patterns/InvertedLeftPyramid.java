package Patterns;

public class InvertedLeftPyramid {
    public static void main(String args[]){
        for(int i=4;i>=1;i--){
            for(int j=4;j>=1;j--){
                System.out.print("* ");
                if(i>j){
                    System.out.println();
                    break;
                }
                else{
                    continue;
                }
            }
            System.out.println();
        }
    }
}
