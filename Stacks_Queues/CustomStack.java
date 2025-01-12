
public class CustomStack {

    protected int[] data;
    private final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public CustomStack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        data[++ptr] = item;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from an empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot get peek from an empty stack");
        }
        return data[ptr];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
