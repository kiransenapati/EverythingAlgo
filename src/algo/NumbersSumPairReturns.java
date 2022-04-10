// NumbersSumPair.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo;

import java.awt.Point;
import java.util.HashSet;

/**
 *
 */
public class NumbersSumPairReturns
{
    public static void main(final String[] args)
    {
        final int[] arr2 = {
                2, 4, 5, 3, 4, 6, 3, 4, 4
        };
        final HashSet<Point> result = isSumPairPresent(arr2, 8);
        System.out.println("output for arr2: " + result.size());
        for (final Point p : result)
        {
            System.out.println(p.toString());
        }
    }

    public static HashSet<Point> isSumPairPresent(final int[] array, final int sum)
    {
        final HashSet<Point> result = new HashSet<>();
        final HashSet<Integer> comp = new HashSet<>();
        for (final int el : array)
        {
            if (comp.contains(el))
            {
                result.add(new Point(el, sum - el));
            }
            comp.add(sum - el);
        }

        return result;
    }

}
