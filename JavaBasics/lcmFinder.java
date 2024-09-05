// package JavaBasics;

import java.lang.*;

public class lcmFinder {

    // Method to compute the GCD of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Method to compute the LCM of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        // Calculate LCM
        int lcm = lcm(num1, num2);

        // Output the result
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
