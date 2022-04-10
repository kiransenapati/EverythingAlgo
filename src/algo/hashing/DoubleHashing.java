package algo.hashing;

public class DoubleHashing
{

    int MAX_LENGTH = 20, PRIME = 7, SIZE = 13, current_size;
    int[] hashTable = new int[MAX_LENGTH];

    DoubleHashing()
    {
        for (int i = 0; i < MAX_LENGTH; i++)
        {
            hashTable[i] = -1;
        }
        current_size = -1;
    }

    boolean isFull()
    {
        return current_size == MAX_LENGTH;
    }

    int hash1(final int key)
    {
        return key % SIZE;
    }

    int hash2(final int key, final int i)
    {
        return (hash1(key) + i * (PRIME - (key % PRIME))) % SIZE;
    }

    void insert(final int key)
    {
        if (!isFull())
        {
            final int key1 = hash1(key);
            if (key1 < 0)
            {
                System.out.println("Inefficient has function for: " + key);
                return;
            }
            if (key1 < MAX_LENGTH && !search(key) && hashTable[key1] == -1)
            {
                hashTable[key1] = key;
                current_size++;
            }
            else
            {
                int i = 0;
                while (true)
                {
                    final int key2 = hash2(key, i);
                    if (key2 < 0)
                    {
                        System.out.println("Inefficient has function for: " + key);
                        return;
                    }
                    if (key2 > -1 && key2 < MAX_LENGTH && !search(key) && hashTable[key2] == -1)
                    {
                        hashTable[key2] = key;
                        current_size++;
                        break;
                    }
                    i++;
                }
            }
        }
    }

    void print()
    {
        for (int i = 0; i < MAX_LENGTH; i++)
        {
            if (hashTable[i] != -1)
            {
                System.out.println(i + " --> " + hashTable[i]);
            }
            else
            {
                System.out.println(i);
            }
        }
    }

    boolean search(final int key)
    {
        int index = hash1(key);
        boolean found = false;
        if (index > -1 && index < MAX_LENGTH && hashTable[index] == key)
        {
            found = true;
        }
        else
        {
            int i = 1;
            while (index > -1 && index < MAX_LENGTH && hashTable[index] != -1)
            {
                index = hash2(key, i);
                if (index > -1 && index < MAX_LENGTH && hashTable[index] == key)
                {
                    found = true;
                    break;
                }
                i++;
            }
        }
        return found;
    }

    public static void main(final String[] args)
    {
        final int arr[] = {
                19, 27, 36, 10, 113, 43465, 22, 0, 11, 10, 115, 00001, 345235243, 5
        };
        final DoubleHashing dHash = new DoubleHashing();
        for (final int i : arr)
        {
            dHash.insert(i);
        }
        dHash.print();
        //System.out.println(dHash.search(36));
    }

}
