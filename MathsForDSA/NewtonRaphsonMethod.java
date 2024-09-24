// Newton Raphson Method

public class NewtonRaphsonMethod {

    static double NRMSQRT(int n) {
        double x = n;
        double root;

        while (true) {
            root = 0.5 * (x + (n / x));

            if (Math.abs(root - x) < 1) {
                break;
            }

            x = root;
        }

        return root;
    }

    public static void main(String[] args) {
        int num = 40;
        System.out.println(NRMSQRT(num));
    }
}
