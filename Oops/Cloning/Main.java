
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human akshansh = new Human(21, "Akshansh");

        // Human other = new Human(akshansh);
        Human other = (Human) akshansh.clone();
        System.out.println(other.name + " " + other.age);
    }
}
