
public class CustomLL {

    private Node head;
    private Node tail;
    private int size;

    public CustomLL() {
        this.size = 0;
    }

    public void insertAtFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertAtIndex(int value, int index) {

        if (index == 0) {
            insertAtFirst(value);
            return;
        }
        if (index == size) {
            insertAtIndex(value, index);
            return;
        }
        Node curr = head;

        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }

        Node newNode = new Node(value, curr.next);
        curr.next = newNode;
        size++;
    }

    public void insertAtLast(int value) {

        if (tail == null) {
            insertAtFirst(value);
        } else {
            Node newNode = new Node(value);
            tail.next = newNode;
            tail = newNode;
            size += 1;
        }
    }

    public void print() {
        Node current = this.head;

        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }

        System.out.print("null");
    }

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
