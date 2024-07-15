package JavaBasics;

import java.math.BigInteger;

public class factorial {

    public static void main(String[] args) {
        int num = 24;
        BigInteger factorial = new BigInteger("1");
        for (int i = num; i >= 1; i--) {
            BigInteger temp = new BigInteger(i + "");
            factorial = factorial.multiply(temp);
        }
        System.out.println(factorial);

        //Usual method to get factorial
        // int num = 8;
        // int factorial = 1;
        // for (int i = num; i >= 1; i--) {
        //     factorial *= i;
        // }
        // System.out.println(factorial);
        //To print factorial of big numbers we need to use BigInteger
    }
}
