package Graphs;

import java.util.Scanner;


//Not an efficient method.
public class graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int v = sc.nextInt();

        int a[][] = new int[v + 1][v + 1];
        graph g = new graph();
        g.addEdge(a, e, v);
    }

    static void addEdge(int a[][], int source, int dest) {
        a[source][dest] = 1;
        a[dest][source] = 1;
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
