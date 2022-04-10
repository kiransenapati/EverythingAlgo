// ArrayRotation.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo;

import java.util.Arrays;

/**
 *
 */
public class ArrayRotation
{

    /**
     * i/p = [1, 2, 3, 4, 5, 6, 7]
     * o/p = [3, 4, 5, 6, 7, 1, 2]
     * param = no. of rotations 2
     *
     * check if the rotation % length
     * i = rotation; end of array -> store it in result array
     * i = 0; i < rotation; result_array[length+i] = array[i];
     *
     * @param args
     */
    public static void main(final String[] args)
    {
        final int[] array = {
                1, 2, 3, 4, 5, 6, 7
        };
        int[] output = new int[array.length];
        final int rotation = 7;
        final int act_rotate = array != null && array.length != 0 ? rotation % array.length : 0;
        if (act_rotate != 0)
        {
            int j = 0;
            for (int i = act_rotate; i < array.length; i++, j++)
            {
                output[j] = array[i];
            }
            for (int i = 0; i < act_rotate; i++)
            {
                output[j + i] = array[i];
            }
        }
        else
        {
            output = array;
        }
        System.out.println(Arrays.toString(output));

    }

}
