
public class BinarySearchSQRT {

    // Time complexity: 0(log(n))
    static double squareRoot(int num, int p) {
        double root = 0.0;
        int s = 0;
        int e = num;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == num) {
                return m;
            }
            if (m * m < num) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root < num) {
                root += inc;
            }

            root -= inc;
            inc /= 10;
        }

        return root;
    }

    public static void main(String[] args) {
        int n = 40;
        int p = 2;
        System.out.printf("%.2f", squareRoot(n, p));
    }
}
