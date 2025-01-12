
// Dynamic Stack where the array is never full
public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super(); // calls the CustomStack()
    }

    public DynamicStack(int size) {
        super(size); // calls the CustomStack(size)
    }

    @Override
    public void push(int item) {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2]; // Create a temp array

            System.arraycopy(data, 0, temp, 0, data.length); // Copy the elements of data to temp

            data = temp;
        }

        // insert the item
        super.push(item);
    }

}
