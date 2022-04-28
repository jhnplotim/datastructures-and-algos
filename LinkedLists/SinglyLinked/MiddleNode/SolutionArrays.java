package LinkedLists.SinglyLinked.MiddleNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class SolutionArrays {

    // Time complexity O(n), where N is the number of nodes in the given list
    // Space complexity O(n), the space used by the array nodes below
    public ListNode middleNode(ListNode head) {
        // Based on the constraints of the problem, it is said that that number of nodes is between 1 and 100
        // We can create an array of size 100

        ListNode[] nodes = new ListNode[100];

        int nodeCount = 0;

        ListNode cur = head;

        do {
            nodes[nodeCount++] = cur;
            cur = cur.next;

        } while (cur != null);

        int midIndex = nodeCount / 2;

        return nodes[midIndex];
    }
    
}
