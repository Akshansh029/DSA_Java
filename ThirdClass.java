import java.util.Scanner;

public class ThirdClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter either 1 or 0: ");
        int per = sc.nextInt();
        do{
            System.out.println("Enter your marks: ");
            int marks = sc.nextInt();
                if(marks > 100){
                System.out.println("Marks must be out of 100");
                }
                else if (marks>=90 && marks <= 100) {
                System.out.println("This is Good");
                }
                else if(89 >= marks && marks >=60){
                System.out.println("This is also Good");
                }
                else if(marks <= 59 && marks >=0 ){
                System.out.println("This is Good as well");
                }
                else{
                System.out.println("Marks cannot be zero");
                }
                System.out.println("Enter your marks: ");
                per = sc.nextInt();
        }while(per == 1);
        sc.close();
    }
}
