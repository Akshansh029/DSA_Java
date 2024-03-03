package Simple_Singly_Linked_List;

public class ReversingList {
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

    //Reversing the singly linked list
    public void reverseList(){
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
    public static void main(String[] args) {
        ReversingList rl = new ReversingList();
        rl.head = new ListNode(5);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(9);
        ListNode fourth = new ListNode(7);
        rl.head.next = second; 
        second.next = third; 
        third.next = fourth;

        rl.printList();
        rl.reverseList();
        rl.printList();
    }
}
