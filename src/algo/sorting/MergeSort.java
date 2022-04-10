package algo.sorting;

import java.util.Arrays;

public class MergeSort
{
    static void merge(final int[] arr, final int left, final int mid, final int right)
    {

        final int n1 = mid - left + 1;
        final int n2 = right - mid;

        // form the 2 arrays left to mid and mid+1 to right
        final int[] a1 = new int[n1], a2 = new int[n2];
        for (int i = 0; i < n1; i++)
        {
            a1[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++)
        {
            a2[i] = arr[mid + 1 + i];
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        //loop through the a1 & a2 at once and place the elements in arr
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2)
        {
            if (a1[i] <= a2[j])
            {
                arr[k] = a1[i];
                i++;
            }
            else
            {
                arr[k] = a2[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = a1[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = a2[j];
            j++;
            k++;
        }

    }

    static void sort(final int[] arr, final int left, final int right)
    {
        if (left < right)
        {
            final int mid = left + (right - left) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(final String[] args)
    {
        final int[] arr = {
                5, 7, 10, 11, 15, 16, 17, 1, 2, 3, 8, 9, 13, 14
        };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
