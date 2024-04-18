import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Binary_Tree {
    Node root;

    // Method to set the root of the binary tree
    public void setRoot(Node root) {
        this.root = root;
    }

    void print_level() {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.println(temp.data + " ");

            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }
}

public class Tree_Level {
    public static void main(String[] args) {
        Binary_Tree tree = new Binary_Tree();
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        // Creating the binary tree
        Node root = new Node(a[0]);
        Node node1 = new Node(a[1]);
        Node node2 = new Node(a[2]);
        Node node3 = new Node(a[3]);
        Node node4 = new Node(a[4]);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        tree.setRoot(root);

        System.out.println("Level order traversal : ");
        tree.print_level();
    }
}
