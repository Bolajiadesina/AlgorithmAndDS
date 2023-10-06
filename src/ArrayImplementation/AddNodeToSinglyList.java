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

    private void display() {

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

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;

        return temp;
    }

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;

        }
        previous.next = null;
        return current;
    }

    public void delete(int position) {
        // possition is valid and starting from 1
        // 3 --> 4 --> 7 --> 8 -->9 ---> null
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public boolean searchElement(ListNode head, int searchKey) {
        if (head == null) {
            return false;
        }

        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {

                return true;
            }
            current = current.next;

        }
        return false;
    }

    public void insertNode(ListNode newNode) {
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        System.out.println(head);

    }

    public void deleteNode(int key) {
        ListNode current = head;
        ListNode temp = null;

        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }


        if(current == null){
            return;
        }

        temp.next = current.next;
    }

    public static void main(String[] args) {
        AddNodeToSinglyList sLinkedList = new AddNodeToSinglyList();

        // create valies for the chain

        sLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // // now we connect them together
        // sLinkedList.head.next = second; // 10 ----> 1
        // second.next = third;// 10 ---->8 --->1
        // third.next = fourth;// 11
        // sLinkedList.printSindlyLinkedList();

        // System.out.println("Length is --- "+ sLinkedList.lenght());

        // sLinkedList.insertFirst(11);
        // sLinkedList.insertFirst(8);
        // sLinkedList.insertFirst(1);

        // sLinkedList.insert_(1, 3);
        // sLinkedList.insert_(2, 5);
        // sLinkedList.insert_(1, 2);
        // sLinkedList.insert_(2, 4);
        // sLinkedList.insert_(5, 7);

        // System.out.println((sLinkedList.deleteFirst().data)); ;
        //sLinkedList.delete(2);
        sLinkedList.deleteNode(11);
        sLinkedList.display();

        // sLinkedList.insertNode();

    }
}
