
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        CustomLL list = new CustomLL();
        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(40);
        list.insertAtLast(50);
        list.insertAtIndex(30, 2);
        list.print();

        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        // for (int i = 0; i < list1.size(); i++) {
        //     System.out.print(list1.get(i) + " -> ");
        // }
        // System.out.print("null");
    }
}
