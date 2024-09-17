
public class SetIthBit {

    static void setBit(int num, int index) {
        int check = 1 << index - 1;

        int out = num | check;
        System.out.println(out);
    }

    static void resetBit(int num, int index) {
        int mask = ~(1 << index - 1);
        System.out.println(Integer.toBinaryString(mask));

        int out = num & mask;
        System.out.println(out);
    }

    public static void main(String[] args) {
        int num = 56;
        resetBit(num, 4);
    }
}
