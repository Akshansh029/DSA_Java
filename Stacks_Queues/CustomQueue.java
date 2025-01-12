
public class CustomQueue {

    protected int[] data;
    private final int DEFAULT_SIZE = 10;
    private int end = -1;

    public CustomQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public void insert(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        data[++end] = item;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot remove from an empty queue");
        }
        int removed = data[0];
        for (int i = 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }
        data[end--] = 0;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot get front from an empty queue");
        }
        return data[0];
    }

    public int end() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot get end from an empty queue");
        }
        return data[end];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.print("END");
    }

    public boolean isFull() {
        return end == data.length - 1;
    }

    public boolean isEmpty() {
        return end == -1;
    }
}
