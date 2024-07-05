package JavaBasics;

public class typecasting {

    public static void main(String[] args) {

        //Typecasting from smaller to larger data type
        byte b = 10;
        int i = b;
        System.out.println(i);

        //Typecasting from larger to smaller data type
        long l = 1000000;
        int x = (int) l;
        System.out.println(x);

        //This can lead to lossy conversion of data types
        int a = 343;
        byte c = (byte) a;
        System.out.println(c); //Output 87
    }
}
