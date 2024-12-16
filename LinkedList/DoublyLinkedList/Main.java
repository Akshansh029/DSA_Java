
public class Main {

    public static void main(String[] args) {
        CustomDLL list = new CustomDLL();
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        list.print();
        list.reverse();
    }
}
