// ConstructBinarySearchTree.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo.binaryTree;

/**
 * [10, 5, 1, 7, 40, 50]
 */
public class ConstructBinarySearchTree
{
    class Node
    {
        int value;
        Node left, right;

        Node(final int value)
        {
            this.value = value;
            left = right = null;
        }
    }

    Node getBinaryTree(final int[] arr)
    {
        Node root = null;
        if (arr.length > 0)
        {
            root = new Node(arr[0]);
        }

        int i;
        for (i = 1; i < arr.length; i++)
        {
            if (arr[0] < arr[i])
            {
                break;
            }
        }
        int[] leftArr, rightArr;
        if (i > 0)
        {
            leftArr = new int[i - 1];
            rightArr = new int[arr.length - i];

            for (int j = 1, k = 0, l = 0; j < arr.length; j++)
            {
                if (j < i)
                {
                    leftArr[k] = arr[j];
                    k++;
                }
                else
                {
                    rightArr[l] = arr[j];
                    l++;
                }
            }

            if (leftArr.length > 0)
            {
                root.left = getBinaryTree(leftArr);
            }
            if (rightArr.length > 0)
            {
                root.right = getBinaryTree(rightArr);
            }
        }

        return root;
    }

    void printTree(final Node node)
    {

        if (node == null)
        {
            return;
        }
        System.out.print(node.value + " ");
        printTree(node.left);
        printTree(node.right);
    }

    /**
     * @param args
     */
    public static void main(final String[] args)
    {
        final int[] arr = {
                6, 15, 4, 32, 2, 1
        };
        final ConstructBinarySearchTree bst = new ConstructBinarySearchTree();
        final Node root = bst.getBinaryTree(arr);
        bst.printTree(root);

    }

}
