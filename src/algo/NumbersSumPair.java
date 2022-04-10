// NumbersSumPair.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo;

import java.util.HashSet;

/**
 *
 */
public class NumbersSumPair
{
    public static void main(final String[] args)
    {
        final int[] arr2 = {
        };

        //System.out.println("output for arr1: " + isSumPairPresent(arr1, 8));
        System.out.println("output for arr2: " + isSumPairPresent(arr2, 8));
    }

    public static boolean isSumPairPresent(final int[] array, final int sum)
    {
        final HashSet<Integer> comp = new HashSet<>();
        for (final int el : array)
        {
            if (comp.contains(el))
            {
                return true;
            }
            comp.add(sum - el);
        }

        return false;
    }

}
