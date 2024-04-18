package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int v = sc.nextInt();

        ArrayList<LinkedList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=v;i++){
            adj.add(new LinkedList<>());
        }
        addEdge(adj,e,v);
        printGraph(adj);
    }
    static void addEdge(ArrayList<LinkedList<Integer>> adj,int source,int dest){
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }
    static void printGraph(ArrayList<LinkedList<Integer>> adj){
        for(int i=1;i<adj.size();i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (Integer neighbor : adj.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
