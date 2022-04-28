package LinkedLists.SinglyLinked.MiddleNode;

public class SolutionFastSlowPointer {
    // When traversing the list with a pointer slow, make another pointer fast that traverses twice as fast. 
    // When fast reaches the end of the list, slow must be in the middle.
    // Time complexity: O(n) where n is the number of nodes in the list
    // Space complexity: O(1), the space used by slow and fast
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}