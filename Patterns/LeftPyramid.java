package Patterns;

public class LeftPyramid {

    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
                if (i == j) {
                    System.out.println();
                    break;
                }
            }
            System.out.println();
        }
    }
}
