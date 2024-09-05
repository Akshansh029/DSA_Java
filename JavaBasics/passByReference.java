// package JavaBasics;

public class passByReference {

    public static void pass(int a) {
        a++;
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        pass(a);
        System.out.println(a);
    }
}
