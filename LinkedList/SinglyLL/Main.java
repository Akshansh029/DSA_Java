
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        CustomLL list = new CustomLL();
        // list.insertAtLast(10);
        // list.insertAtLast(20);
        // list.insertAtLast(40);
        // list.insertAtLast(50);
        // list.insertAtIndex(30, 2);
        // list.print();
        // list.deleteFirst();
        // System.out.println();
        // list.print();
        // System.out.println();
        // list.deleteLast();
        // list.print();
        // list.deleteAtIndex(2);
        // list.print();
        // System.out.println();
        // list.insertRec(2, 25);
        // list.print();

        list.insertAtLast(10);
        list.insertAtLast(10);
        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(30);
        list.print();
        list.removeDuplicate();
        list.print();

        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
    }
}
