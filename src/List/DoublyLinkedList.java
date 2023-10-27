package List;

import List.DoublyLinkedList;

public class DoublyLinkedList<ListNode> {
    private ListNode head;
    private ListNode tail;
    private int lenght;

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.lenght = 0;
    }

    public boolean isEmpty() {
        return lenght == 0;

    }

    public int lenght() {
        return lenght;
    }


    public void display(){
        ListNode temp= head;
        while(temp!= null){
            System.out.println(temp.data +" ---> ");

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
    }
}
