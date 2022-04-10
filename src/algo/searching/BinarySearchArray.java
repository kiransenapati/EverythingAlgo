// BinarySearchArray.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo.searching;

/**
 *
 */
public class BinarySearchArray
{

    static void findElement(final int[] arr, final int left, final int right, final int el)
    {
        if (right >= left)
        {
            final int mid = left + (right - left) / 2;
            if (arr[mid] == el)
            {
                System.out.println("Found the element at " + mid);
                return;
            }
            else if (arr[mid] > el)
            {
                findElement(arr, left, mid - 1, el);
            }
            else
            {
                findElement(arr, mid + 1, right, el);
            }
        }
    }

    public static void main(final String[] args)
    {
        final int arr[] = {
                1, 2
                };
                findElement(arr, 0, arr.length - 1, 10);

    }

}
