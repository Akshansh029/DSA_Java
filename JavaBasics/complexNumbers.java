package JavaBasics;

class ComplexNums {

    int real;
    int imaginary;

    ComplexNums(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void print() {
        System.out.println(real + " + " + imaginary + "i");
    }

    //Adding two complex numbers
    ComplexNums add(ComplexNums y) {
        int sumReal = this.real + y.real;
        int sumImaginary = this.imaginary + y.imaginary;
        ComplexNums res = new ComplexNums(sumReal, sumImaginary);

        return res;
    }

    //Subtracting two complex numbers
    ComplexNums subtract(ComplexNums y) {
        int subReal = this.real - y.real;
        int subImaginary = this.imaginary - y.imaginary;
        ComplexNums res = new ComplexNums(subReal, subImaginary);

        return res;
    }
}

public class complexNumbers {

    public static void main(String[] args) {
        ComplexNums c1 = new ComplexNums(2, 5);
        ComplexNums c2 = new ComplexNums(3, 7);

        c1.print();
        c2.print();

        ComplexNums c3 = c1.add(c2);
        c3.print();

        ComplexNums c4 = c1.subtract(c2);
        c4.print();

    }
}
