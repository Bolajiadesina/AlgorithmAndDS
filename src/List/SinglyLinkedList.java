package List;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;// Generic node
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    private  void printSindlyLinkedList() {

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("null");

    }


    public int lenght(){

        if(head== null){
            return 0;
        }
        int count= 0;
        ListNode current= head;

        while(current!=null){
            count++;
            current=current.next;

        }

        return count;

    }
    
    public static void main(String[] args) {
        SinglyLinkedList sLinkedList = new SinglyLinkedList();

        // create valies for the chain

        sLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // now we connect them together
        sLinkedList.head.next = second; // 10 ----> 1
        second.next = third;// 10 ---->8 --->1
        third.next = fourth;// 11
        sLinkedList.printSindlyLinkedList();

        System.out.println("Length is --- "+ sLinkedList.lenght());
    }

}
