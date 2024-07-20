package Patterns;

public class Practice {

    public static void main(String[] args) {
//Solid Reactangle

        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j <= 4; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
// Hollow reactangle
        // for (int i = 0; i <= 4; i++) {
        //     for (int j = 0; j <= 4; j++) {
        //         if (i == 0 || j == 0 || i == 4 || j == 4) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
//Left triangle
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
                if (i == j) {
                    System.out.println();
                    break;
                } else {
                    continue;
                }
            }
            System.out.println();
        }

    }
}
