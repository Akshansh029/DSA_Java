
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

    // Find length of the cycle in LL
    public static int lengthCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                int count = 0;
                do {
                    count++;
                    slow = slow.next;
                } while (slow != fast);
                return count;
            }
        }
        return 0;
    }

    // Finding the starting node of the cycle
    public Node detectCycle(Node head) {
        // Fast and slow pointer method
        if (head == null || head.next == null) {
            return null;
        }

        Node fast = head;
        Node slow = head;
        Node node = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        if (fast != slow) {
            return null;
        }

        while (node != slow) {
            node = node.next;
            slow = slow.next;
        }
        return node;
    }

    // Middle node of the LL
    public static Node middleNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    // Sorting LL
    public void bubbleSort(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            Node first = get(c);
            Node second = get(c + 1);

            if (first.value < second.value) {
                if (first == head) {
                    second = head;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(c - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    tail.next = first;
                } else {
                    Node prev = get(c - 1);
                    first.next = second.next;
                    prev.next = second;
                }
            }
            bubbleSort(r, c + 1);
        } else {
            bubbleSort(r - 1, 0);
        }
    }

    // Reversing a LL using recursion
    public void recursiveReverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        recursiveReverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // Reversing a LL using iterative method
    public void iterativeReverse() {
        if (size < 2) {
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
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
