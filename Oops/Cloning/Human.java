
public class Human implements Cloneable {

    int age;
    String name;
    int[] arr;

    public Human() {
        age = 1;
        name = "Unknown";
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4, 5};
    }

    // Normal way of copying another object using constructors
    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    // Using Java's Cloneable interface and overriding method to clone an object which is a faster way to clone an object
    @Override
    public Object clone() throws CloneNotSupportedException {
        // This is a shallow copy
        // return super.clone();

        Human twin = (Human) super.clone();

        // making a deep copy
        twin.arr = new int[twin.arr.length];

        // Array automatic copy
        System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);
        // Manual copying
        // for (int i = 0; i < twin.arr.length; i++) {
        //     twin.arr[i] = this.arr[i];
        
        return twin;
    }
}
