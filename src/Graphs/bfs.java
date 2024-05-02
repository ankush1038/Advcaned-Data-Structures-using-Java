package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class bfs {
    private static boolean bfs(ArrayList<ArrayList<Integer>> adj, int src, int dest, int v, int pred[], int dist[]){
        LinkedList<Integer> queue = new LinkedList<Integer>();
        boolean[] vis = new boolean[v];
        for(int i=0;i<v;i++){
            vis[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }
        vis[src] = true;
        dist[src] = 0;
        queue.add(src);

        while (!queue.isEmpty()){
            int curr = queue.remove();
            for(int i=0;i<adj.get(curr).size();i++){
                int neighbor = adj.get(curr).get(i);
                if(!vis[neighbor]){
                    vis[neighbor] = true;
                    dist[neighbor] = dist[curr] + 1;
                    pred[neighbor] = curr;
                    queue.add(neighbor);

                    if(neighbor == dest){
                        return true;
                    }
                }
            }
        }



        return false;
    }

    public static void main(String[] args) {
        int v = 5; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Populate adjacency list with edges
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);

        int src = 0;
        int dest = 4;

        int[] pred = new int[v];
        int[] dist = new int[v];

        boolean isReached = bfs(adj, src, dest, v, pred, dist);
        System.out.println("Is destination reached? " + isReached);
    }
    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

}
