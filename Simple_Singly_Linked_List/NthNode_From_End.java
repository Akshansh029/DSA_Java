package Simple_Singly_Linked_List;

public class NthNode_From_End {
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

    //Nth node from beginning
    public int nthFromBegin(int num){
        if(num <= 0){
            System.out.println("Num cannot be less than or equal to zero");
        }
        ListNode current = head;
        int count = 1;
        while(current != null && count < num){
            current = current.next;
            count++;
        }
        if(current == null){
            throw new IllegalArgumentException("The list is too short.");
        }
        return  current.data;
    }

    
    public static void main(String[] args) {
        NthNode_From_End nfe = new NthNode_From_End();
        nfe.head = new ListNode(5);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(9);
        ListNode fourth = new ListNode(7);
        nfe.head.next = second; 
        second.next = third; 
        third.next = fourth;

        nfe.printList();
        System.out.println(nfe.nthFromBegin(2));
        System.out.println(nfe.nthFromBegin(4));
        System.out.println(nfe.nthFromBegin(0));
        // System.out.println(nfe.nthFromBegin(5)); //Will throw error as the linkedlist is not long enough to reach the fifth element
    }
}
