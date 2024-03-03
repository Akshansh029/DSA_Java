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
        System.out.println("null");
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
        if(head == null || head.next == null){
            return head;
        }
        ListNode previous = null;
        ListNode current = head;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    //deleting node at a given position
    public int deleteAt(int position){
        if(position == 1){
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            return temp.data;
        }
        else{
            ListNode current = head;
            ListNode previous = null;
            int count = 1;
            while(count < position){
                previous = current;
                current = current.next;
                count++;
            }
            previous.next = current.next;
            current.next = null;
            return current.data;
        }
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
        // System.out.println(dn.deleteFirst().data);
        // dn.printList();
        // System.out.println(dn.deleteLast().data);
        dn. printList();
        System.out.println(dn.deleteAt(3));
        dn.printList();
    }
}