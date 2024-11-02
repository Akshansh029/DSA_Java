
import java.util.Arrays;

public class CustomGenArrayList<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }

        data[size++] = num;
    }

    public T removeLast() {
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[2 * data.length];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);

        CustomGenArrayList<String> list2 = new CustomGenArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");

        System.out.println(list2);
    }
}
