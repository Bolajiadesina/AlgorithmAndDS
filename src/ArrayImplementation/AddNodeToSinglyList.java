package ArrayImplementation;

import List.SinglyLinkedList;

public class AddNodeToSinglyList {
    private ListNode head;

    private static class ListNode {
        private int data;// Generic node
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    private void printSindlyLinkedList() {

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("null");

    }

    public int lenght() {

        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;

        while (current != null) {
            count++;
            current = current.next;

        }

        return count;

    }

    public void insert_(int position, int value) {
        // 1----> 4----> 5
        // 1----> 6-----> 4-----> 5
        ListNode node = new ListNode(value);

        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous_ = head;
            int count = 1;

            while (count < position - 1) {
                previous_ = previous_.next;
                count++;
            }
            ListNode current = previous_.next;
            previous_.next = node;
            node.next = current;
        }
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }

        current.next = newNode;
    }

    public static void main(String[] args) {
        AddNodeToSinglyList sLinkedList = new AddNodeToSinglyList();

        // create valies for the chain

        // sLinkedList.head = new ListNode(10);
        // ListNode second = new ListNode(1);
        // ListNode third = new ListNode(8);
        // ListNode fourth = new ListNode(11);

        // // now we connect them together
        // sLinkedList.head.next = second; // 10 ----> 1
        // second.next = third;// 10 ---->8 --->1
        // third.next = fourth;// 11
        // sLinkedList.printSindlyLinkedList();

        // System.out.println("Length is --- "+ sLinkedList.lenght());
  
            // sLinkedList.insertFirst(11);
            //  sLinkedList.insertFirst(8);
            //   sLinkedList.insertFirst(1);
  
        sLinkedList.insert_(1, 3);
        sLinkedList.insert_(2, 5);
        sLinkedList.insert_(1, 2);
        sLinkedList.insert_(2, 4);
  
    }
}
