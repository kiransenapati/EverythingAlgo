// LinearSearch.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo.searching;

/**
 *
 */
public class LinearSearch
{

    public static void main(final String[] arr)
    {
        final int[] numbers = {
                234, 32453, 567, 346, 2134243, -253456, 222, 456
        };
        final int el = -253456;
        int left = 0;
        int right = numbers.length - 1;
        boolean found = false;
        while (left <= right)
        {
            if (numbers[left] == el)
            {
                System.out.println("Found it at: " + left);
                found = true;
                break;
            }
            else if (numbers[right] == el)
            {
                System.out.println("Found it at: " + right);
                found = true;
                break;
            }
            left++;
            right--;
        }
        if (!found)
        {
            System.out.println("Number not found " + el);
        }
        int i = Integer.MAX_VALUE;
        System.out.println("Sum is: " + i++);
    }

}
