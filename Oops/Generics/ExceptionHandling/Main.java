
public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            // int c = divide(a, b);
            // System.out.println("The result of a / b = " + c);

            String name = "Akshansh";

            if (name.equals("Akshansh")) {
                throw new MyException(name + " is a problem");
            }
        } catch (MyException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } // Normal approach to declare multiple catch blocks0
        // catch (MyException e) {  
        //     System.out.println(e.getMessage());
        // } catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // }
        finally {
            System.out.println("Execution completed");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }

        return a / b;
    }
}
