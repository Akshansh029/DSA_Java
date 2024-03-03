package Simple_Singly_Linked_List;

public class searchingElement {
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

    //searching for an element in singly linked list
    public boolean searchElement(int key){
        ListNode current = head;
        while(current != null){
            if(current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public static void main(String[] args) {
    searchingElement se = new searchingElement();
    se.head = new ListNode(5);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(9);
    ListNode fourth = new ListNode(7);
    se.head.next = second; 
    second.next = third; 
    third.next = fourth;

    se.printList();
    System.out.println(se.searchElement(2));;
    }
}
