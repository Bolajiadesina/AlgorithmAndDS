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
        public void insertlast(int value){
            ListNode newNode= new ListNode(value);
            if(isEmpty()){
                head= newNode;
            }else{
                tail.next= newNode;
            }
            newNode.previous = tail;
            tail= newNode;
            lenght++;
        }



    public void displayForwrd(){
       if(head == null){
            return;
       } 

       ListNode temp= head;
       while(temp != null){
        System.out.print(temp.data + "  -->  ");
        temp=temp.next;

       }
       System.out.println("null");
    }
    public void displayBackward(){
       if(tail == null){
            return;
       } 

       ListNode temp= tail;
       while(temp != null){
        System.out.print(temp.data + "  -->  ");
        temp=temp.previous;

       }
       System.out.println("null");
    }

    public void insertFirst(int value){
        ListNode newMode=  new ListNode(value);
        if(isEmpty()){
            tail= newMode;
        }else{
            head.previous= newMode;
        }
        newMode.next= head;
        head= newMode;
        lenght++;


  }

  public void insertlast2(int value){
    ListNode newNode= new ListNode(value);
        if(isEmpty()){
            head= newNode;
        }else{
            tail.next= newNode;
            newNode.previous=tail;
        }
        tail= newNode;
        lenght++;


  }

  public ListNode deletefirstNode(){
    if(isEmpty()){
        //throw new NoSuchElementException();
    }

    ListNode temp = head;
    if(head ==tail){
        tail = null;
    }else{
        head.next.previous= null;

    }
    head = head.next;
    temp.next= null;
    return temp;

  }

  public ListNode deletelastNode(){
    if(isEmpty()){
        //throw new NoSuchElementException();
    }

    ListNode temp = head;
    if(head ==tail){
        head = null;
    }else{
        tail.previous.next= null;

    }
    tail = tail.previous;
    temp.previous= null;
    return temp;

  }



    public static void main(String[] args) {
        DoublyLinkedList d= new DoublyLinkedList();
        d.display();
        d.insertlast(1);
         d.insertlast(10);
          d.insertlast(15);
           d.insertlast(25);

           d.displayForwrd();
           d.displayBackward();


    }
}





































































































































































































































































































































































































































































































































































































































































































































































































































































































































  
