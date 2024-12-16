
public class Main {

    public static void main(String[] args) {
        CustomDLL list = new CustomDLL();
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        // list.print();
        // // list.reverse();
        list.insertAtLast(0);
        list.print();
        // list.insertAtIndex(10, 3);
        // list.deleteAtBeginning();
        list.deleteNode(2);
        list.print();
    }
}
