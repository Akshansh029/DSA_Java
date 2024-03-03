package Simple_Singly_Linked_List;

public class Deleting_Nodes{
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
        ListNode current = head;
        while(current != null){
            System.out.print(current.data +  " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    //deleting first node of singly linked list
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    //deleting last node of the list
    public ListNode deleteLast(){
        if(head.next == null){
            head = null;
        }
        ListNode previous = head;
        while()
    }
    public static void main(String[] args) {
        Deleting_Nodes dn = new Deleting_Nodes();
        dn.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(4);

        dn.head.next = second;
        second.next = third;
        third.next = fourth;
        System.out.println(dn.deleteFirst().data);
        dn.printList();
    }
}