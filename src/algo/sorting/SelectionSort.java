// SelectionSort.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo.sorting;

import java.util.Arrays;

/**
 *
 */
public class SelectionSort
{

    static int getSmallIndex(final int[] arr, final int start)
    {
        int small = start;
        for (int i = small; i < arr.length - 1; i++)
        {
            if (arr[small] > arr[i + 1])
            {
                small = i + 1;
            }
        }
        return small;
    }

    public static void main(final String[] args)
    {
        final int[] arr = {
                11, 1
        };
        for (int i = 0; i < arr.length - 1; i++)
        {
            final int small = getSmallIndex(arr, i);
            final int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
