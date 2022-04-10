// BuildBstFromPreOrder.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo.binaryTree;

import algo.Node;

/**
 *
 */
public class BuildBstFromPreOrder
{

    public static Node build(final Node node, final int[] arr, final int min, final int max) {

        int k = min;
        for (int i = min; i < max; i++)
        {
            if (arr[i] > node.getValue())
            {
                k = i;
                break;
            }
        }
        if (min < max)
        {
            node.left = build(new Node(arr[min]), arr, min + 1, k);
            node.right = build(new Node(arr[k]), arr, k + 1, max);
        }
        return node;
    }

    public static void main(final String[] args)
    {
        final int[] arr = {
                10, 5, 1, 6, 40, 50
        };
        final Node node = build(new Node(arr[0]), arr, 1, arr.length);
        DepthFirstTraversal.inOrder(node);
    }

}
