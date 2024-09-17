// Find Ith bit of the integer

public class FindIthBit {

    static void findBit(int num, int index) {
        int check = 1 << index - 1;

        int out = num & check;
        String sc = Integer.toBinaryString(out);
        System.out.println(sc.charAt(0));
    }

    public static void main(String[] args) {
        findBit(131, 5);
    }
}
