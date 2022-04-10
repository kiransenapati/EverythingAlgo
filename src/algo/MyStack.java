// MyStack.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo;

/**
 *  Impl using the array
 *
 *  [1, 2, 3, 4, 5, 6]
 *
 */
public class MyStack
{
    int top = -1;
    int[] stack = new int[5];

    MyStack(final int[] array) {
        for (int i = 0; i < array.length & !isFull(); i++)
        {
            push(array[i]);
        }
    }

    public static void main(final String[] args)
    {
        final int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        final MyStack myStack = new MyStack(array);
        System.out.println("myStack length is: " + myStack.stack.length);
        while (!myStack.isEmpty())
        {
            System.out.println("poped out values are: " + myStack.pop());
        }

    }

    int push(final int el)
    {
        if (!isFull())
        {
            stack[top + 1] = el;
            top++;
        }
        else
        {
            System.out.println("Stack is full/overflowed!");
        }
        return top;
    }

    int pop()
    {
        int el = 0;
        if (!isEmpty())
        {
            el = stack[top];
            top--;
        }
        else
        {
            System.out.println("Stack is empty/underflowed!");
        }
        return el;
    }

    int peek()
    {
        return top;
    }

    boolean isEmpty()
    {
        return top == -1;
    }

    boolean isFull()
    {
        return top == stack.length - 1;
    }


}
