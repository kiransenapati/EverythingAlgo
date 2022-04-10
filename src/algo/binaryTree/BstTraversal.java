// BstTraversal.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo.binaryTree;

/**
 *
 */
public class BstTraversal
{

    // Java program to construct BST from given preorder
    // traversal

    // A binary tree node
    static class Node
    {

        int data;
        Node left, right;

        Node(final int d)
        {
            data = d;
            left = right = null;
        }
    }

    static class Index
    {

        int index = 0;
    }

    static class BinaryTree
    {

        Index index = new Index();

        // A recursive function to construct Full from pre[].
        // preIndex is used to keep track of index in pre[].
        Node constructTreeUtil(
                final int pre[],
                final Index preIndex,
                final int low,
                final int high,
                final int size)
        {

            // Base case
            if (preIndex.index >= size || low > high)
            {
                return null;
            }

            // The first node in preorder traversal is root. So
            // take the node at preIndex from pre[] and make it
            // root, and increment preIndex
            final Node root = new Node(pre[preIndex.index]);
            preIndex.index = preIndex.index + 1;

            // If the current subarray has only one element, no
            // need to recur
            if (low == high)
            {
                return root;
            }

            // Search for the first element greater than root
            int i;
            for (i = low; i <= high; ++i)
            {
                if (pre[i] > root.data)
                {
                    break;
                }
            }

            // Use the index of element found in preorder to
            // divide preorder array in two parts. Left subtree
            // and right subtree
            root.left = constructTreeUtil(
                    pre,
                    preIndex,
                    preIndex.index,
                    i - 1,
                    size);
            root.right = constructTreeUtil(
                    pre,
                    preIndex,
                    i,
                    high,
                    size);

            return root;
        }

        // The main function to construct BST from given
        // preorder traversal. This function mainly uses
        // constructTreeUtil()
        Node constructTree(final int pre[], final int size)
        {
            return constructTreeUtil(
                    pre,
                    index,
                    0,
                    size - 1,
                    size);
        }

        // A utility function to print inorder traversal of a
        // Binary Tree
        void printInorder(final Node node)
        {
            if (node == null)
            {
                return;
            }
            printInorder(node.left);
            System.out.print(node.data + " ");
            printInorder(node.right);
        }

        // Driver code
        public static void main(final String[] args)
        {
            final BinaryTree tree = new BinaryTree();
            final int pre[] = new int[] {
                    10, 40, 50
            };
            final int size = pre.length;
            final Node root = tree.constructTree(pre, size);
            System.out.println(
                    "Inorder traversal of the constructed tree is ");
            tree.printInorder(root);
        }
    }

}
