
public class Human implements Cloneable {

    int age;
    String name;

    public Human() {
        age = 1;
        name = "Unknown";
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
