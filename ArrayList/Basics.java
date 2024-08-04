
import java.util.ArrayList;

// package ArrayList;
public class Basics {

    public static void main(String[] args) {
        //Initialization
        ArrayList<Integer> l1 = new ArrayList<>();

        //Adding elements
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        //Print with loop
        // for (int i = 0; i < l1.size(); i++) {
        //     System.out.print(l1.get(i) + ", ");
        // }
        //Printing directly
        System.out.println(l1);

        //Adding element at some index
        l1.add(1, 10);
        System.out.println(l1);

        //Modifying the value at any index
        l1.set(1, 20);
        System.out.println(l1);

        //Removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        //Removing an element of value i
        l1.remove(Integer.valueOf(5));
        System.out.println(l1);

        //Checking if an element exists
        System.out.println(l1.contains(10));
    }
}
