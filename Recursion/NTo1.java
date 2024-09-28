
public class NTo1 {

    static void printNTo1(int n) {
        if (n < 1) {
            return;

        }
        System.out.print(n + " ");
        printNTo1(n - 1);
    }

    static void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printNTo1(10);
        print1ToN(10);
    }
}
