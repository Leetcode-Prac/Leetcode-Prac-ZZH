//Given the head of a Singly LinkedList, write a function to determine if the LinkedList has a cycle in it or not.
//fast $ slow pointers
//Easy
public class LinkedListCycle {
    public static boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        int len = 0;
//        if LinkedList is cycle, fast cannot be null, fast will pass slow at certain point
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            len++;
            if(slow == fast){
                System.out.println("linkedList cycle length is: " + len);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));

        head.next.next.next.next.next.next = head.next.next;
        System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));
    }
}
