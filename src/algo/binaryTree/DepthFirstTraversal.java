package algo.binaryTree;

import algo.Node;

public class DepthFirstTraversal
{
    public static void preOrder(final Node node)
    {
        if (node == null)
        {
            return;
        }
        System.out.print(node.getValue() + ", ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    public static void inOrder(final Node node)
    {
        if (node == null)
        {
            return;
        }

        inOrder(node.getLeft());
        System.out.print(node.getValue() + ", ");
        inOrder(node.getRight());
    }

    public static void postOrder(final Node node)
    {
        if (node == null)
        {
            return;
        }

        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.print(node.getValue() + ", ");
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
        bt.root.setRight(n2);
        n1.setLeft(n3);
        n1.setRight(n4);
        n2.setLeft(n5);
        System.out.println("Printing preorder:");
        preOrder(bt.root);

        System.out.println("Printing inorder:");
        inOrder(bt.root);

        System.out.println("Printing postorder:");
        postOrder(bt.root);
    }

}
