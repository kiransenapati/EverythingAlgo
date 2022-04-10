package algo.binaryTree;

import algo.Node;

public class BinarySearchTree
{

    public static void findElement(final int el, Node node)
    {
        if (node == null)
        {
            return;
        }
        if (node.getValue() == el)
        {
            System.out.println("Found element");
        }
        if (el < node.getValue())
        {
            node = node.getLeft();
        }
        else
        {
            node = node.getRight();
        }
        findElement(el, node);
    }

    public static Node findElementParent(final int el, final Node node)
    {
        if (node == null)
        {
            return null;
        }
        Node newNode;
        if (el < node.getValue())
        {
            newNode = node.getLeft();
        }
        else
        {
            newNode = node.getRight();
        }
        if (newNode != null && newNode.getValue() == el)
        {
            return node;
        }
        return findElementParent(el, newNode);
    }

    public static void insert(final int el, final Node node)
    {
        if (node.getValue() == el)
        {
            System.out.println("Element already present!");
        }
        if (el < node.getValue())
        {
            if (node.getLeft() != null)
            {
                insert(el, node.getLeft());
            }
            else
            {
                final Node newNode = new Node(el);
                node.setLeft(newNode);
                return;
            }
        }
        else
        {
            if (node.getRight() != null)
            {
                insert(el, node.getRight());
            }
            else
            {
                final Node newNode = new Node(el);
                node.setRight(newNode);
                return;
            }
        }
    }

    public static Node add(final int el, final Node node)
    {
        if (node == null)
        {
            return new Node(el);
        }
        if (el < node.getValue())
        {
            node.left = add(el, node.getLeft());
        }
        else if (el > node.getValue())
        {
            node.right = add(el, node.getRight());
        }
        return node;
    }

    public static void remove(final int el, final Node root)
    {
        final Node parentNode = findElementParent(el, root);
        if (parentNode == null)
        {
            // check if the root node == el, remove the root node.
            // find the minimum of the root.right tree
            // remove the minimum element from root.right tree.
            return;
        }
        else
        {
            //this applies only for a leaf node
            if (parentNode.getLeft().getValue() == el)
            {
                parentNode.setLeft(null);
                return;
            }
            else if (parentNode.getRight().getValue() == el)
            {
                parentNode.setRight(null);
                return;
            }
        }
        remove(el, parentNode);
    }
    public static Node deleteNode(final int el, final Node root)
    {

        if (root == null)
        {
            return null;
        }
        if (el < root.getValue())
        {
            root.left = deleteNode(el, root.getLeft());
        }
        else if (el > root.getValue())
        {
            root.right = deleteNode(el, root.getRight());
        }
        else
        {
            // el == root.value
            if (root.getLeft() == null)
            {
                return root.getRight();
            }
            else if (root.getRight() == null)
            {
                return root.getLeft();
            }
            else
            {
                // left and right are present
                // find the min of root.right
                final int minValue = minValue(root.right);
                root.setValue(minValue);
                root.right = deleteNode(minValue, root.right);
            }

        }


        return root;
    }
    public static Node deleteNode2(final int el, final Node root)
    {

        if (root == null)
        {
            return null;
        }
        if (el < root.getValue())
        {
            root.left = deleteNode(el, root.getLeft());
        }
        else if (el > root.getValue())
        {
            root.right = deleteNode(el, root.getRight());
        }
        else
        {
            // el == root.value
            if (root.getLeft() == null)
            {
                return root.getRight();
            }
            else if (root.getRight() == null)
            {
                return root.getLeft();
            }
            else
            {
                Node succParent = root;
                Node succ = root.right;

                while (succ.left != null)
                {
                    succParent = succ;
                    succ = succ.left;
                }

                if (succParent != root)
                {
                    succParent.left = succ.right;
                }
                else
                {
                    succParent.right = succ.right;
                }
                root.setValue(succ.getValue());
            }
        }
        return root;
    }
    public static int minValue(Node node)
    {
        int minValue = node.getValue();
        while (node.left != null) {
            minValue = node.getLeft().getValue();
            node = node.getLeft();
        }
        return minValue;
    }
    public static void main(final String[] args)
    {
        //extracted();

        final int[] arr = {10, 5, 1, 6, 40, 50};
        final BinaryTree bt = new BinaryTree();
        for (final int i : arr)
        {
            bt.root = add(i, bt.root);
        }

        DepthFirstTraversal.inOrder(bt.root);
    }

    private static void extracted()
    {
        final BinaryTree bt = new BinaryTree(8);
        final Node n1 = new Node(3);
        final Node n2 = new Node(1);
        final Node n3 = new Node(6);
        final Node n4 = new Node(4);
        final Node n5 = new Node(7);
        final Node n6 = new Node(10);
        final Node n7 = new Node(14);
        final Node n8 = new Node(13);

        bt.root.setLeft(n1);
        bt.root.setRight(n6);
        n1.setLeft(n2);
        n1.setRight(n3);
        n3.setLeft(n4);
        n3.setRight(n5);

        n6.setLeft(new Node(9));
        n6.setRight(n7);
        n7.setLeft(n8);
        //findElement(13, bt.root);
        //add(0, bt.root);
        DepthFirstTraversal.inOrder(bt.root);
        System.out.println(" ");
        //final Node parent = findElementParent(6, bt.root);
        //System.out.println(parent != null ? parent.getValue() : null);
        deleteNode(11, bt.root);
        DepthFirstTraversal.inOrder(bt.root);
    }

}
