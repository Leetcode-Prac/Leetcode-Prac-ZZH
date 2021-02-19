package Linkedlists;

public class CircularLinkedList {
//    initialized to null
    private Node first;
    private Node last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    private boolean isEmpty() {
        return first == null;// have no node in the linkedList
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            last = newNode;
        }
        newNode.next = first;// newNode --> old first
        first = newNode;//first place
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            first = newNode;
        } else {
            last.next = newNode;//the next value of the last node will point to the new node
            last = newNode;//we make the new node we created be the last one in the list
        }
    }

    public int deleteFirst(){
        int temp = first.data;
//only have the single node
        if(first.next == null){
            last = null;
        }
        first = first.next;// first will point to old's new value
        return temp;
    }


    public void displayList(){
        System.out.println("List (first --> last) ");
        Node currentNode = first;
        while(currentNode != null){
//            the method in Node class
            currentNode.displayNode();
            currentNode= currentNode.next;
        }
        System.out.println();
    }
}
