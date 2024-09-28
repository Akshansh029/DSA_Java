
public class LCM {

    static int findHCF(int a, int b) {
        if (a == 0) {
            return b;
        }
        return findHCF(b % a, a);
    }

    static int findLCM(int a, int b) {
        return (a * b) / findHCF(a, b);
    }

    public static void main(String[] args) {
        System.out.println(findLCM(3, 7));
    }
}
