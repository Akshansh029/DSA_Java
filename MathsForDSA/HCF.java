
public class HCF {

    static int findHCF(int a, int b) {
        if (a == 0) {
            return b;
        }
        return findHCF(b % a, a);
    }

    public static void main(String[] args) {
        System.out.println(findHCF(3, 9));
    }
}
