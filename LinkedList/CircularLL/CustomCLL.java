
public class CustomCLL {

    private Node head;
    private Node tail;

    public CustomCLL() {
        this.head = null;
        this.tail = null;
    }

    public void insertBegin(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        tail.next = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void delete(int target) {
        if (head.value == target) {
            head = head.next;
            tail.next = head;
            return;
        }
        Node curr = head;
        do {
            if (curr.next.value == target) {
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        } while (curr != head);
    }

    public void print() {
        if (head == null) {
            System.out.println("No elements to print");
            return;
        }
        Node curr = head;
        do {
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        } while (curr != head);

        System.out.println("HEAD");
    }

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
