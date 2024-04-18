//class Node {
//    int data;
//    Node prev;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.prev = null;
//        this.next = null;
//    }
//}
//
//public class Stack {
//    public Node top;
//
//    public Stack() {
//        this.top = null;
//    }
//
//    public boolean isEmpty() {
//        return top == null;
//    }
//
//    public void push(int data) {
//        Node newNode = new Node(data);
//        if (isEmpty()) {
//            top = newNode;
//        } else {
//            newNode.next = top;
//            top.prev = newNode;
//            top = newNode;
//        }
//    }
//
//    public int pop() {
//        if (isEmpty()) {
//            throw new IllegalStateException("Stack is empty");
//        }
//
//        int poppedValue = top.data;
//        if (top.next != null) {
//            top.next.prev = null;
//            top = top.next;
//        } else {
//            top = null;
//        }
//
//        return poppedValue;
//    }
//
//    public int peek() {
//        if (isEmpty()) {
//            throw new IllegalStateException("Stack is empty");
//        }
//        return top.data;
//    }
//
//    public void display() {
//        Node current = top;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Stack stack = new Stack();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        System.out.println("Stack after pushes:");
//        stack.display();
//
//        System.out.println("Popped element: " + stack.pop());
//
//        System.out.println("Stack after pop:");
//        stack.display();
//
//        System.out.println("Peeked element: " + stack.peek());
//    }
//}
