
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human akshansh = new Human(21, "Akshansh");

        // Human other = new Human(akshansh);
        Human other = (Human) akshansh.clone();
        System.out.println(other.name + " " + other.age);
        System.out.println(Arrays.toString(other.arr));

        other.arr[0] = 100;
        System.out.println(Arrays.toString(akshansh.arr));
    }

}
