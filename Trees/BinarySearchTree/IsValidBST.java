package Trees.BinarySearchTree;

import Trees.BinarySearchTree.BST.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class IsValidBST {
    // Approach 2
    private Integer prev;
    
    
    public boolean isValidBST(TreeNode root) {
        // Uncomment for Approach 1
        // return validate(root, null, null);
        
        // Approach 2
        prev = null;
        return inOrderTraversal(root);
    }
    
    // Approach 1
    public boolean validate(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        
        if ((min != null && node.data <= min) || (max != null && node.data >= max)) {
            return false;
        }
        
        
        return validate(node.left, min, node.data) && validate(node.right, node.data, max);
    }
    
    // Approach 2
    public boolean inOrderTraversal(TreeNode node) {
        if (node == null) {
            return true;
        }
        
        if (!inOrderTraversal(node.left)) return false;
        if (prev != null && node.data <= prev) return false;
        prev = node.data;
        return inOrderTraversal(node.right);
        
        
    }
}
