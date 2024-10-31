
public class Box {

    int l;
    int b;
    int h;

    public Box() {
        l = 1;
        b = 1;
        h = 1;
    }

    public Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public void displayInfo() {
        System.out.printf("Length: %d, Breadth: %d, Height: %d \n", l, b, h);
    }
}
