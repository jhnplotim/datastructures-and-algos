package Trees.BinarySearchTree;

public class BST {

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    TreeNode root;

    BST() {
        root = null;
    }

    private TreeNode insert(TreeNode root, int dataToInsert) {
        if(root == null) {
            root = new TreeNode(dataToInsert);
            return root;
        }

        if(root.data > dataToInsert) {
            // Insert to the left
            root.left = insert(root.left, dataToInsert);
        } else {
            // Insert to the right
            root.right = insert(root.right, dataToInsert);
        }
        return root;
    }

    private TreeNode search(TreeNode root, int target) {
        if (root == null || root.data == target) {
            return root;
        }

        if (root.data < target) {
            // Search right
            return search(root.right, target);
        } else {
            // Search left
            return search(root.left, target);
        }
    }

    private void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
        
    }

    private void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void insertIntoTree(int dataToInsert) {
        root = insert(root, dataToInsert);
    }

    public TreeNode searchTree(int dataToSearch) {
        return search(root, dataToSearch);
    }

    public void preOrderTraversal() {
        preOrder(root);
    }

    public void inOrderTraversal() {
        inOrder(root);
    }

    public void postOrderTraversal() {
        postOrder(root);
    }
}
