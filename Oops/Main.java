
public class Main {

    public static void main(String[] args) {
        Indian akshansh = new Indian("Akshansh", 20, 80000, false);
        System.out.println(akshansh);

        Indian kanizah = new Indian("Kanizah", 21, 100000, false);
        System.out.println(kanizah);

        NewZealander kane = new NewZealander("Kane", 35, 800000, true);
        System.out.println(kane);

        NewZealander boult = new NewZealander("Boult", 33, 800000, true);
        System.out.println(boult);

        // Box box = new Box(2, 2, 2);
        // box.displayInfo();
        // BoxWeight boxWeight = new BoxWeight(10);
        // boxWeight.displayInfo();
        // Box box1 = new BoxWeight(5, 5, 5, 20);
        // box1.displayInfo();
    }
}
