package Simple_Singly_Linked_List;

public class Inserting_Nodes {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;
        
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void printList(){
        ListNode current  = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Inserting node at the beginning of the list
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // Inserting node at the end of the list
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    // Inserting node at the a particular position
    public void insertAt(int data, int position){
        ListNode node = new ListNode(data); 
        if(position == 1){
            node.next = head;
            head = node;
        }
        else{
            ListNode previous = head;
            int count = 1;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }
    public static void main(String[] args) {
        Inserting_Nodes idn = new Inserting_Nodes();
        idn.head = new ListNode(10);
        ListNode second = new ListNode(7);
        ListNode third = new ListNode(9);
        ListNode fourth = new ListNode(11);
        ListNode fifth = new ListNode(3);

        idn.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        idn.insertAt(23, 3);
        idn.printList();
    }
}
