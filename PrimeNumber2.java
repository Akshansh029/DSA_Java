
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber2 {

    public static List<Integer> segmentedSieve(long L, long R) {
        int limit = (int) Math.sqrt(R) + 1;
        List<Integer> primes = simpleSieve(limit);

        boolean[] isPrime = new boolean[(int) (R - L + 1)];
        Arrays.fill(isPrime, true);

        for (int prime : primes) {
            long start = Math.max(prime * prime, (L + prime - 1) / prime * prime);

            for (long j = start; j <= R; j += prime) {
                isPrime[(int) (j - L)] = false;
            }
        }

        List<Integer> primeList = new ArrayList<>();
        for (int i = 0; i <= R - L; i++) {
            if (isPrime[i] && (i + L) > 1) {
                primeList.add((int) (i + L));
            }
        }

        return primeList;
    }

    private static List<Integer> simpleSieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        long L = 10;
        long R = 100;
        List<Integer> primes = segmentedSieve(L, R);
        System.out.println("Primes in the range [" + L + ", " + R + "] are: ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}
