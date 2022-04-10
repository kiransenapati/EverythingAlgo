package algo;
import java.util.Arrays;

public class IncrementNumberInFormOfArray2
{

    public static void main(final String[] args)
    {
        final int[] arr = {
                9, 9, 9
        };
        int carry = 1;
        for (int i = arr.length - 1; i >= 0; i--)
        {
            if (arr[i] + carry == 10)
            {
                arr[i] = 0;
            }
            else
            {
                arr[i]++;
                carry = 0;
                break;
            }
        }
        if (carry == 1 & arr.length > 0)
        {
            final int[] newArr = new int[arr.length + 1];
            newArr[0] = 1;
            System.out.println(Arrays.toString(newArr));
        }
        else
        {
            System.out.println(Arrays.toString(arr));
        }
    }

}
