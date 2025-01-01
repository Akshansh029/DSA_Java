
public class Main {

    public static void main(String[] args) {
        CustomCLL list = new CustomCLL();
        // list.insertBegin(1);
        // list.insertBegin(2);
        // list.insertBegin(3);
        // list.insertBegin(4);
        // list.insertBegin(5);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.print();
        list.delete(1);
        list.print();
    }
}
