// MyQueue.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo;

/**
 * top = index of 1st element i.e. 1 so 0
 * [1, 2, 3, 4]
 * rear = last element entered index i.e. 4 so 3
 * enqueue insert 5 so queue[rear+1] = 5, rear++
 * [1, 2, 3, 4, 5]
 * dequeue -> left shift
 * [2, 3, 4, 5]
 */
public class MyQueue
{
    int rear = -1;
    int[] queue;

    MyQueue(final int size)
    {
        this.queue = new int[size];
    }

    void enqueue(final int el)
    {
        if (!isFull())
        {
            rear++;
            queue[rear] = el;
        }
        else
        {
            System.out.println("Queue is full!");
        }
    }

    int dequeue()
    {
        final int toReturn = !isEmpty() ? queue[0] : 0;
        for (int i = 0; i <= rear && !isEmpty(); i++)
        {
            if (i + 1 < rear)
            {
                queue[i] = queue[i + 1];
            }
            else
            {
                queue[i] = queue[rear];
                rear--;
            }
        }
        return toReturn;
    }

    void printQueue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty!");
        }
        int i = 0;
        while (i <= rear)
        {
            System.out.println(queue[i]);
            i++;
        }

    }

    public boolean isFull()
    {
        return rear == (queue.length - 1);
    }

    public boolean isEmpty()
    {
        return rear == -1;
    }

    public static void main(final String[] args)
    {
        final MyQueue q1 = new MyQueue(3);
        //        q1.enqueue(1);
        //        q1.enqueue(2);
        //        q1.enqueue(3);
        //        q1.enqueue(4);
        //        q1.enqueue(5);
        q1.printQueue();
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
    }

}
