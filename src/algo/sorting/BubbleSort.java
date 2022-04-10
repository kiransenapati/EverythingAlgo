package algo.sorting;

import java.util.Arrays;

public class BubbleSort
{

    public static void main(final String[] args)
    {
        final int arr[] = {
                1, 2, 3, 4, 5, 6, 7, 8
        };
        int length = arr.length, count = 0;
        for (int i = 0; i < arr.length; i++, length--)
        {
            boolean swapped = false;
            for (int j = 0; j < length - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    final int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
                count++;
            }
            count++;
            if (!swapped)
            {
                break;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));


    }

}
