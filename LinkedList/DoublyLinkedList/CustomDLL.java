
public class CustomDLL {

    private Node head;

    public void insertAtFirst(int value) {
        Node newNode = new Node(value);

        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertAtIndex(int value, int index) {

        if (index == 0) {
            insertAtFirst(value);
            return;
        }
        Node curr = head;

        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }

        if (curr.next == null) {
            insertAtLast(value);
        } else {
            Node newNode = new Node(value, curr.next, curr);
            curr.next.prev = newNode;
            curr.next = newNode;
        }
    }

    public void insertAtLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            newNode.prev = null;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
        newNode.next = null;
    }

    public void print() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node current = head;
        Node last = null;
        while (current != null) {
            last = current;
            current = current.next;
        }
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }

        System.out.println("null");
    }

    private class Node {

        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
