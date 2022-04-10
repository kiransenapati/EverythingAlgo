// IncrementNumberInFormOfArray.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Input is an array = [4, 8, 2]
 * Out is an array = [4, 8, 3]
 * i/p = [9, 9, 9]
 * o/p = [1, 0, 0, 0]
 */
public class IncrementNumberInFormOfArray
{
    // loop i=n-1 to 0
    // carry = 0
    // check for the last element and increment it
    // if carry == 1 -> set[i] += 1;
    // if the output % 10 == 0 -> set[i] = 0, carry = 1;
    // if carry == 1 [length +1], [0] = 1;
    // else return outputArray;
    public static void main(final String[] args) {
        System.out.println("The incremented array is : " + Arrays.toString(incrementArray(IntStream.of(9).toArray())));
        System.out.println("The incremented array is : " + Arrays.toString(incrementArray(new int[] {
                1, 2, 3
        })));

    }

    static int[] incrementArray(final int[] array) {

        int carry = 1;
        for (int i = array.length - 1; i >= 0; i--)
        {
            final int sum = array[i] + 1;
            if (sum % 10 != 0)
            {
                array[i] = sum;
                carry = 0;
                return array;
            }
            else
            {
                array[i] = 0;
            }
        }
        if (carry == 1 && array.length > 0)
        {
            final int[] newOutput = new int[array.length + 1];
            newOutput[0] = 1;
            return newOutput;
        }
        return array;
    }



}
