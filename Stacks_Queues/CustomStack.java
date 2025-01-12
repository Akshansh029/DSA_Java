
public class CustomStack {

    protected int[] data;
    private final int DEFAULT_SIZE = 10;

    public CustomStack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }
}
