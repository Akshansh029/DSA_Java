
public class IfNumberIs2Power {

    static boolean is2PowerN(int n) {
        if (n == 0) {
            return false;
        }
        return (n & n - 1) == 0;
    }

    public static void main(String[] args) {
        int num = 55;
        System.out.println(is2PowerN(num));
    }
}
