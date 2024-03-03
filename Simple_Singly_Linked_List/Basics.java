package Simple_Singly_Linked_List;

public class Basics {

    private ListNode head; // head of list

    private static class ListNode{  //  inner class for creating node
        @SuppressWarnings("unused")
        private int data;
        @SuppressWarnings("unused")
        private ListNode next;  

        public ListNode(int data){ // Creating ListNode method
            this.data = data;
            this.next = null;
        }
    }

    //Method for printing the linked list
    public void printList(){
        ListNode current  = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Finding the length of the singly linked list
    public void findLength() {
        ListNode current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        System.out.println("The length of the linked list is: "+count);
    }
    public static void main(String[] args) {
        Basics sll = new Basics();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(11);

        // Connecting all the nodes to form a singly linked list
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.printList();
        // 10 --> 1 --> 5 --> 11 --> null

        sll.findLength();
        // Output: 4;
    }
}
