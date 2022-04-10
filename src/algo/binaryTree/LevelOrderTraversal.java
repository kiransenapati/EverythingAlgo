// LevelOrderTraversal.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo.binaryTree;

import algo.Node;

/**
 *
 */
public class LevelOrderTraversal
{

    static void printLevelOrder(final Node node, final int i)
    {
        if (node == null)
        {
            return;
        }
        if (i == 1)
        {
            System.out.println(node.getValue());
        }
        else if (i > 1)
        {
            printLevelOrder(node.getLeft(), i - 1);
            printLevelOrder(node.getRight(), i - 1);
        }
    }

    static int getHeight(final Node node)
    {
        if (node == null)
        {
            return 0;
        }
        else
        {
            final int lheight = getHeight(node.getLeft());
            final int rheight = getHeight(node.getRight());
            if (lheight > rheight)
            {
                return lheight + 1;
            }
            return rheight + 1;
        }
    }

    static void printTree(final Node root)
    {
        final int height = getHeight(root);
        for (int i = 1; i <= height; i++)
        {
            printLevelOrder(root, i);
        }
    }

    public static void main(final String[] args)
    {
        final BinaryTree bt = new BinaryTree();
        bt.root = new Node(10);
        bt.root.setLeft(new Node(20));
        bt.root.setRight(new Node(30));
        bt.root.getLeft().setLeft(new Node(40));
        bt.root.getLeft().setRight(new Node(50));
        bt.root.getRight().setLeft(new Node(60));

        printTree(bt.root);

    }
}
