
public class SieveOfEratosthenes {

    static void primeTillN(int n) {
        boolean[] primes = new boolean[n + 1];
        // False in the primes array means number is Prime;

        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int k = 2; k < primes.length; k++) {
            if (primes[k] == false) {
                System.out.println(k + " ");
            }
        }

    }

    public static void main(String[] args) {
        int num = 39;
        primeTillN(num);
    }
}
