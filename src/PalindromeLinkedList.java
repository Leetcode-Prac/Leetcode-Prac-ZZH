import java.util.List;

public class PalindromeLinkedList {
//    https://leetcode.com/problems/palindrome-linked-list/submissions/
//    234. Palindrome Linked List
//    Easy two pointer equi-side
//    Given a singly linked list, determine if it is a palindrome.
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     * @param head
     */
//Example 1:
//Input: 1->2
//Output: false
//Example 2:
//Input: 1->2->2->1
//Output: true
//Follow up:
//Could you do it in O(n) time and O(1) space?
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
//            fast = 2times of slow; when fast goes to the end, slow is in the middle of the node.
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode firstHalfHead = head;
        ListNode secondHalfHead = reverse(slow.next);

        while(secondHalfHead != null && firstHalfHead != null){
            if(secondHalfHead.val != firstHalfHead.val){
                return false;
            }
//            don't forget it
            secondHalfHead= secondHalfHead.next;
            firstHalfHead = firstHalfHead.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode newHead = null;
        while(head != null){
//            save the next path
            ListNode next = head.next;
//            reverse the cursor
            head.next = newHead;
//            switch the value
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        System.out.println(list.isPalindrome(node));
    }
}
