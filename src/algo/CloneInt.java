// CloneInt.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo;

/**
 *
 */
public class CloneInt
{
    public static void main(final String args[])
    {
        final int intArray[] = {
                1, 2, 3
        };

        final int cloneArray[] = intArray.clone();

        // will print false as deep copy is created
        // for one-dimensional array
        System.out.println(intArray == cloneArray);
        System.out.println(intArray + " " + cloneArray);

        for (int i = 0; i < cloneArray.length; i++)
        {
            System.out.print(cloneArray[i] + " ");
        }
    }
}
