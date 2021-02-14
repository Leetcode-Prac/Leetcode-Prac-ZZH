package Linkedlists;

public class SinglyLinkedList {
    private Node first;
    public SinglyLinkedList(){

    }
    public boolean isEmpty(){
        return (first == null);
    }

    //used to insert at the beginning of the list
    public void insertFirst(int data){
        Node newNode = new Node();
//        adding a newNode at the beginning
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data){
        Node currentNode = first;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        currentNode.next = newNode;

    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
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
