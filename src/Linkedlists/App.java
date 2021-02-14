package Linkedlists;

public class App {
    public static void main(String[] args) {
//        Node nodeA = new Node();
//        Node nodeB = new Node();
//        Node nodeC = new Node();
//        Node nodeD = new Node();
//        nodeA.data = 4;
//        nodeB.data = 3;
//        nodeC.data = 7;
//        nodeD.data = 8;
//
//        nodeA.next = nodeB;
//        nodeB.next = nodeC;
//        nodeC.next = nodeD;
//
//        System.out.println(listLength(nodeA));

        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);
        myList.insertLast(8888);

        myList.displayList();

    }
    public static int listLength(Node nodeA){
        int length = 0;
        while(nodeA != null){
            length++;
            nodeA = nodeA.next;
        }
        return length;
    }



}
