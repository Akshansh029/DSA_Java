
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

    // insertion using recursion
    public void insertRec(int index, int val) {
        head = insertRec(index, val, head);
    }

    public Node insertRec(int index, int val, Node node) {
        if (index == 0) {
            Node newNode = new Node(val, node.next);
            size++;
            return newNode;
        }
        node.next = insertRec(index - 1, val, node.next);
        System.out.println(node.value);
        return node;
    }

    public void insertAtIndex(int value, int index) {

        if (index == 0) {
            insertAtFirst(value);
            return;
        }
        if (index == size) {
            insertAtLast(value);
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

    public void deleteFirst() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }
        Node prev = get(index - 1);
        prev.next = prev.next.next;
        size--;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }
        Node curr = get(size - 2);

        tail = curr;
        tail.next = null;
        size--;
    }

    public Node find(int value) {
        Node curr = head;

        while (curr.next != null) {
            if (curr.value == value) {
                return curr;
            }
            curr = curr.next;
        }

        return null;
    }

    public int getIndex(int value) {
        Node curr = head;
        for (int i = 0; i < size; i++) {
            if (curr.value == value) {
                return i;
            }
            curr = curr.next;
        }
        return -1;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void print() {
        Node current = this.head;

        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // remove duplicates
    public void removeDuplicate() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next != null && current.next.value == current.value) {
                current.next = current.next.next;
                size--;
            } else {
                current = current.next;
            }
        }
        tail = current;
        tail.next = null;
    }

    // merge two sorted lists
    public static CustomLL mergeTwoLists(CustomLL list1, CustomLL list2) {
        if (list1 == null && list2 == null) {
            return list1;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        Node head1 = list1.head;
        Node head2 = list2.head;
        CustomLL ans = new CustomLL();
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                ans.insertAtLast(head1.value);
                head1 = head1.next;
            } else {
                ans.insertAtLast(head2.value);
                head2 = head2.next;
            }
        }

        while (head1 != null) {
            ans.insertAtLast(head1.value);
            head1 = head1.next;
        }

        while (head2 != null) {
            ans.insertAtLast(head2.value);
            head2 = head2.next;
        }

        return ans;
    }

    // Has cycle in LL
    public static boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }

        return false;
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
