// QuickSort.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo.sorting;

import java.util.Arrays;

/**
 *
 */
public class QuickSort
{

    static int partitionIndex(final int[] arr, final int low, final int high)
    {

        final int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                final int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        final int swap = arr[i + 1];
        arr[i + 1] = pivot;
        arr[high] = swap;

        return i + 1;
    }

    static void quickSort(final int[] arr, final int low, final int high)
    {
        if (low < high)
        {
            final int pivot = partitionIndex(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static void main(final String[] args)
    {
        final int arr[] = {
                10, 2, 20, 5, 6, 6, 8, 1
        };
        //10, 2, 20, 5, 6, 6, 8, 1
        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));


    }

}
