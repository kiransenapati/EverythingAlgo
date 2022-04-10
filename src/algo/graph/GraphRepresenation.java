// GraphRepresenation.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo.graph;

import java.util.ArrayList;

/**
 *
 */
public class GraphRepresenation
{
    static void addEdge(final ArrayList<ArrayList<Integer>> adj, final int u, final int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(final ArrayList<ArrayList<Integer>> adj)
    {
        for (int i = 0; i < adj.size(); i++)
        {
            System.out.println("\n Adjacency list of vertices \n" + i);
            for (int j = 0; j < adj.get(i).size(); j++)
            {
                System.out.print(" -> " + adj.get(i).get(j));
            }
        }
    }

    public static void main(final String[] args)
    {
        final int vertices = 5;
        final ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(vertices);

        for (int i = 0; i < vertices; i++)
        {
            arr.add(new ArrayList<>());
        }

        addEdge(arr, 0, 1);
        addEdge(arr, 0, 4);
        addEdge(arr, 1, 2);
        addEdge(arr, 1, 3);
        addEdge(arr, 1, 4);
        addEdge(arr, 2, 3);
        addEdge(arr, 3, 4);

        printGraph(arr);
    }
}
