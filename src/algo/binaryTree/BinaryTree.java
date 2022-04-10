// BinaryTree.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo.binaryTree;

import algo.Node;

/**
 *
 */
public class BinaryTree
{
    Node root;

    BinaryTree(final int value)
    {
        root = new Node(value);
    }

    /**
     *
     */
    public BinaryTree()
    {
        // TODO Auto-generated constructor stub
    }

    public static void main(final String[] args)
    {
        final BinaryTree bt = new BinaryTree(10);
        final Node n1 = new Node(20);
        final Node n2 = new Node(30);
        final Node n3 = new Node(40);
        final Node n4 = new Node(50);
        final Node n5 = new Node(60);

        bt.root.setLeft(n1);
        bt.root.right = n2;
        n1.setLeft(n3);
        n1.right = n4;
        n2.setLeft(n5);

    }

}


