//import java.util.*;
//class Node{
//    int data;
//    Node prev;
//    Node next;
//
//    public Node(int data){
//        this.data = data;
//        this.prev = null;
//        this.next = null;
//    }
//}
//public class Stack1 {
//    Node top;
//    public Stack1(){
//        this.top=null;
//    }
//
//    public boolean isEmpty(){
//        return top == null;
//    }
//    public void push(int data){
//        Node newNode = new Node(data);
//        if (isEmpty()){
//            top=newNode;
//        }else{
//            newNode.next = top;
//            top.prev = newNode;
//            top=newNode;
//        }
//    }
//    public int peek(){
//        if(isEmpty()){
//            System.out.println("Stack is Empty");
//            return 0;
//        }
//        return top.data;
//    }
//    public int pop(){
//        if(isEmpty()){
//            System.out.println("Stack is Empty");
//        }
//            int poppedValue = top.data;
//            if(top.next!=null){
//                top.next.prev = null;
//                top=top.next;
//            }else{
//                top=null;
//            }
//            return poppedValue;
//    }
//    public void display(){
//        if(isEmpty()){
//            System.out.println("No print Possible");
//        }
//        Node curr = top;
//        while(curr!=null){
//            System.out.print(curr.data + " ");
//            curr=curr.next;
//        }
//        System.out.println();
//    }
//
//
//
//
//    public static void main(String[] args) {
//        Stack1 stack = new Stack1();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        System.out.println("Stack after pushes:");
//        stack.display();
//        System.out.println("Popped Element " + stack.pop());
//        System.out.println("Stack after pop:");
//        stack.display();
//        System.out.println("Top element " + stack.peek());
//    }
//}
