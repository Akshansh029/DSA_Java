
public class BoxWeight extends Box {

    int weight;

    public BoxWeight() {
        super();
        weight = 1;
    }

    public BoxWeight(int weight) {
        super();
        this.weight = weight;
    }

    public BoxWeight(int l, int b, int h, int weight) {
        super(l, b, h);
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Length: %d, Breadth: %d, Height: %d, Weight: %d \n", l, b, h, weight);
    }
}
