
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // CustomLL list = new CustomLL();
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

        // list.insertAtLast(10);
        // list.insertAtLast(10);
        // list.insertAtLast(10);
        // list.insertAtLast(20);
        // list.insertAtLast(30);
        // list.insertAtLast(30);
        // list.print();
        // list.removeDuplicate();
        // list.print();
        CustomLL list1 = new CustomLL();
        CustomLL list2 = new CustomLL();
        list1.insertAtLast(1);
        list1.insertAtLast(2);
        list1.insertAtLast(4);
        list2.insertAtLast(1);
        list2.insertAtLast(3);
        list2.insertAtLast(4);
        CustomLL ans = CustomLL.mergeTwoLists(list1, list2);
        ans.print();
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }
}
