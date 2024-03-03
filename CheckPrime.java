import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Check if the entered number is prime
        boolean isPrime = checkPrime(n);

        // Display the result
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        // Close the Scanner
        scanner.close();
    }

    // Function to check if a number is prime
    private static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }

        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // Prime number
    }
}

