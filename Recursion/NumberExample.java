
public class NumberExample {

    // static void print(int n) {
    //     System.out.println(n);
    //     print2(2);
    // }
    // static void print2(int n) {
    //     System.out.println(2);
    //     print3(3);
    // }
    // static void print3(int n) {
    //     System.out.println(n);
    //     print4(4);
    // }
    // static void print4(int n) {
    //     System.out.println(n);
    //     print5(5);
    // }
    // static void print5(int n) {
    //     System.out.println(5);
    // }
    // Instead of calling different functions, using recursion we can call same function again and again
    static void print(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        print(n + 1);
        // This is called Recursion, a function calling itself
    }

    public static void main(String[] args) {
        print(1);
    }
}
