package algo.binaryTree;

import java.util.Arrays;

public class HeapBinaryTree
{
    int[] arr;
    int capacity = -1;
    int last_element = -1;
    int last_element_copy = -1;

    HeapBinaryTree(final int size)
    {
        this.arr = new int[size];
        capacity = size;
    }

    HeapBinaryTree(final int[] newArr)
    {
        this.arr = new int[newArr.length];
        capacity = newArr.length;
        for (int i = 0; i < capacity; i++)
        {
            insert(newArr[i]);
        }
    }

    boolean isFull()
    {
        if (capacity == last_element + 1)
        {
            return true;
        }
        return false;
    }
    int getCapacity()
    {
        return capacity;
    }

    int getLastElement()
    {
        return last_element;
    }

    int getMin()
    {
        if (getCapacity() <= 0)
        {
            return Integer.MAX_VALUE;
        }
        return arr[0];
    }

    int getParent(final int i)
    {
        return (i - 1) / 2;
    }

    int getLeft(final int i)
    {
        return (2 * i + 1);
    }

    int getRight(final int i)
    {
        return (2 * i + 2);
    }

    void swap(final int i, final int j)
    {
        final int temp = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = temp;
    }

    void decreaseKey(int key, final int value)
    {
        arr[key] = value;
        while (key != 0 && arr[key] < arr[getParent(key)])
        {
            final int parentIndex = getParent(key);
            swap(key, parentIndex);
            key = parentIndex;
        }
    }

    void heapify(final int key)
    {
        int small = key;
        final int left = getLeft(key);
        final int right = getRight(key);
        if (left < last_element && arr[small] > arr[left])
        {
            small = left;
        }
        if (right < last_element && arr[small] > arr[right])
        {
            small = right;
        }
        if (key != small)
        {
            swap(key, small);
            heapify(small);
        }
    }

    int extractMin()
    {
        final int min = arr[0];
        arr[0] = arr[last_element];
        arr[last_element] = 0;
        last_element--;
        heapify(0);

        return min;
    }

    void insert(final int[] newArr)
    {
        for (int i = 0; i < newArr.length; i++)
        {
            insert(newArr[i]);
        }
    }
    void insert(final int value)
    {
        if (!isFull())
        {
            this.last_element++;
            this.arr[last_element] = value;
            int i = this.last_element;
            while (i != 0 && this.arr[i] < this.arr[getParent(i)])
            {
                swap(i, getParent(i));
                i = getParent(i);
            }
        }
    }

    void remove(final int key)
    {
        decreaseKey(key, Integer.MIN_VALUE);
        extractMin();
    }

    void sortDescending()
    {
        last_element_copy = last_element;
        while (last_element > 0)
        {
            swap(0, last_element);
            last_element--;
            heapify(0);
        }
        last_element = last_element_copy;
    }

    public static void main(final String[] args)
    {
        final int[] newArr = {
                50, 60, 0, 50, 25, 15, 16, 3, 2
        };
        System.out.println("Input: " + Arrays.toString(newArr));
        final HeapBinaryTree hbt = new HeapBinaryTree(10);
        hbt.insert(newArr);
        System.out.println("After insert: " + Arrays.toString(hbt.arr));
        hbt.sortDescending();
        System.out.println("After sorting: " + Arrays.toString(hbt.arr));
        //        hbt.decreaseKey(4, 1);
        //        final int root = hbt.extractMin();
        //        System.out.println(Arrays.toString(hbt.arr));
        //        System.out.println("capacity: " + hbt.getCapacity());
        //        System.out.println("lastElement: " + hbt.getLastElement());
        //        System.out.println("Extracted element: " + root);
        //
        //        System.out.println(hbt.extractMin());
        //        System.out.println("2nd extraction: " + Arrays.toString(hbt.arr));
        //        hbt.remove(1);
        //        System.out.println(Arrays.toString(hbt.arr));
    }

}
