
public class Patterns {

    static void invertedTriangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c >= r) {
            System.out.println();
            invertedTriangle(r - 1, 0);
        } else {
            System.out.print("* ");
            invertedTriangle(r, c + 1);
        }
    }

    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle(r, c + 1);
            System.out.print("* ");
        } else {
            triangle(r - 1, 0);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // invertedTriangle(4, 0);
        triangle(4, 0);
    }
}
