import java.util.Scanner;

public class SecondClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Which operation to do: ");
        String operation = sc.nextLine();

        switch (operation) {
            case "+":
                System.out.println("a + b = "+(a+b));
                break;
            case "-":
                System.out.println("a - b = "+(a-b));
                break;
            case "*":
                System.out.println("a * b = "+(a*b));
                break;
            case "/":
                System.out.println("a / b = "+(a/b));
                break;
            case "%":
                System.out.println("a % b = "+(a%b));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        sc.close();
    }
}
