package Trees.BinarySearchTree;

import java.util.Scanner;

public class ExampleMain {

    public static void main(String[] args) {
        BST binarySearchTree = new BST();

        int n, temp;

        Scanner readScanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to insert?");
        n = readScanner.nextInt();

        System.out.println(String.format("Please enter %s number(s)", n));

        for (int i = 0; i < n; i++) {
            temp = readScanner.nextInt();
            binarySearchTree.insertIntoTree(temp);
        }

        System.out.println("Insert into Binary tree completed");

        System.out.println("\nEnter a number to search for? (HINT: Pick a number you did not enter)");
        temp = readScanner.nextInt();
        if (binarySearchTree.searchTree(temp) == null) {
            System.out.println(String.format("%s was NOT found in the BST", temp));
        } else {
            System.out.println(String.format("HOORAY! %s was found in the BST", temp));
        }

        System.out.println("Enter a number to search for? (HINT: Pick a number you entered in the beginning)");
        temp = readScanner.nextInt();
        if (binarySearchTree.searchTree(temp) == null) {
            System.out.println(String.format("%s was NOT found in the BST", temp));
        } else {
            System.out.println(String.format("HOORAY! %s was found in the BST", temp));
        }

        System.out.println("BST preOrder traversal");
        binarySearchTree.preOrderTraversal();

        System.out.println("\nBST inOrder traversal");
        binarySearchTree.inOrderTraversal();

        System.out.println("\nBST postOrder traversal");
        binarySearchTree.postOrderTraversal();



    }
    
}
