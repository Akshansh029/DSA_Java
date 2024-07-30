
import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static List<Integer> simpleSieve(int n) {
        boolean[] isPrime = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }

        isPrime[0] = false;
        isPrime[1] = false;

        List<Integer> primes = new ArrayList<>();

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int n = 50;  // Change this to the upper limit of primes you want to find
        System.out.println("Prime numbers up to " + n + " are:");
        List<Integer> primes = simpleSieve(n);

        // Print the prime numbers
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}
