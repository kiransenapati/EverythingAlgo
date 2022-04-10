// CircularQueue.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo;

/**
 *
 */
public class CircularQueue
{

    private int arr[], size, top, rear, capacity;

    public CircularQueue(final int capacity)
    {
        arr = new int[capacity];
        this.capacity = capacity;
        size = top = 0;
        rear = capacity - 1;
    }

    boolean isFull()
    {
        return size == capacity;
    }

    boolean isEmpty()
    {
        return size == 0;
    }

    void enqueue(final int el)
    {
        if (isFull())
        {
            System.out.println("Is full!");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = el;
        size++;
    }

    int dequeue()
    {
        if (isEmpty())
        {
            return 0;
        }
        final int el = arr[top];
        arr[top] = 0;
        top = (top + 1) % capacity;
        size--;
        System.out.println("Dequed el: " + el);
        return el;
    }

    void printQueue()
    {
        System.out.println("*****************");
        for (final int i : this.arr)
        {
            System.out.println(i);
        }
        System.out.println("top:" + top + " rear:" + rear);
    }

    public static void main(final String[] args)
    {
        final CircularQueue cQueue = new CircularQueue(5);
        cQueue.enqueue(10);
        cQueue.enqueue(20);
        cQueue.enqueue(30);
        cQueue.printQueue();
        cQueue.dequeue();
        cQueue.dequeue();
        cQueue.printQueue();
        cQueue.enqueue(40);
        cQueue.enqueue(50);
        cQueue.printQueue();
        cQueue.dequeue();
        cQueue.dequeue();
        cQueue.printQueue();
        cQueue.dequeue();
        cQueue.dequeue();
        cQueue.enqueue(60);
        cQueue.printQueue();


    }

}
