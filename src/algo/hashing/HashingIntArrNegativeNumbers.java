// HashingIntArrNegativeNumbers.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo.hashing;

/**
 *
 */
public class HashingIntArrNegativeNumbers
{
    public static int MAX = 1000;
    public static boolean[][] index = new boolean[MAX + 1][2];

    public static void add(final int[] arr)
    {
        for (final int i : arr)
        {
            if (i >= 0)
            {
                index[i][0] = true;
            }
            else
            {
                index[Math.abs(i)][1] = true;
            }
        }
    }

    public static boolean search(final int x)
    {
        if (x >= 0)
        {
            return index[x][0];
        }
        return index[Math.abs(x)][1];
    }

    public static void print(final int max)
    {
        for (int i = 0; i <= max; i++)
        {
            System.out.println(i + ": " + index[i][0] + ", " + index[i][1]);
        }
    }

    public static void main(final String[] args)
    {
        final int[] myArr = {
                -1, 0, 10, 11, -9, -5, 6
        };
        add(myArr);
        print(11);
        System.out.println(search(-5));

    }
}
