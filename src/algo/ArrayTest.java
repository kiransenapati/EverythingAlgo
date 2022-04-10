// ArrayTest.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo;

/**
 *
 */
public class ArrayTest
{
    public static void main(final String args[])
    {
        final int intArray[] = new int[3];
        final byte byteArray[] = new byte[3];
        final short shortsArray[] = new short[3];

        // array of Strings
        final String[] strArray = new String[3];

        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass());
        System.out.println(byteArray.getClass());
        System.out.println(shortsArray.getClass());
        System.out.println(strArray.getClass());
    }
}
