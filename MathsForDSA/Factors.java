
import java.util.ArrayList;

public class Factors {

    // O(n) complexity
    static void factor(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // O(sqrt(n)) complexity
    static void factor2(int num) {
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i == num / i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + num / i + " ");
                }
            }
        }
    }

    // To print in the sorted order- Time and Space complexity = o(sqrt(n))
    static void factor3(int num) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i == num / i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(num / i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        factor3(36);
    }
}
