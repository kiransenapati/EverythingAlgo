// Node.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo;

/**
 *
 */
public class Node
{
    int value;
    public Node left;
    public Node right;

    public Node(final int value)
    {
        this.value = value;
        setLeft(right = null);
    }

    /**
     * @return the left
     */
    public Node getLeft()
    {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(final Node left)
    {
        this.left = left;
    }

    /**
     * @return the value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(final int value)
    {
        this.value = value;
    }

    /**
     * @return the right
     */
    public Node getRight()
    {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(final Node right)
    {
        this.right = right;
    }
}