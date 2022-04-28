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
public class SolutionRecursion {
    public ListNode middleNode(ListNode head) {
        int noOfNodes = nodeCount(head);
        
        // Mid node will have as node count of  noOfNodes / 2 + 1
        
        int midNodeCount = (noOfNodes / 2) + 1;
        
        // If there are two middle nodes, return the second
        if (noOfNodes % 2 == 0) {
            midNodeCount = midNodeCount - 1;
        }
        
        return findVal(head, midNodeCount);
    }
    
    public int nodeCount(ListNode node) {
        if (node.next == null) {
            return 1;
        }
        
        return 1 + nodeCount(node.next);
    }
    
    public ListNode findVal(ListNode node, int nodeCount) {
        if (nodeCount(node) == nodeCount) {
            return node;
        }
        
        if (node.next == null) {
            return null;
        }
        
        return findVal(node.next, nodeCount);
    }
}
