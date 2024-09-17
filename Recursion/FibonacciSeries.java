
public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(fibonacci(i) + " ");
        // }
        System.out.print(fibonacci(n));

    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
