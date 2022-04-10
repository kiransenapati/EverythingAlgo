package algo.sorting;

import java.util.Arrays;

public class InsertionSort
{

    public static void main(final String[] args)
    {
        final int[] arr = {
                12, 11, 9, 0, 78, 1, 13, 5, 6
        };
        for (int i = 1; i < arr.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[i] < arr[j])
                {
                    final int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
