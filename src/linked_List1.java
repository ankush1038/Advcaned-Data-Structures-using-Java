//import java.util.*;
//class Node{
//    int data;
//    Node next;
//    public Node(int data){
//        this.data = data;
//        this.next=null;
//    }
//}
//class LinkedList{
//    Node head;
//    public void append(int data){
//        Node newNode= new Node(data);
//
//        if(head == null){
//            head=newNode;
//            return;
//        }
//        Node curr = head;
//        while(curr.next!=null){
//            curr=curr.next;
//        }
//        curr.next=newNode;
//    }
//    public void display(){
//        Node curr = head;
//        while (curr!=null) {
//            System.out.print(curr.data + "->");
//            curr = curr.next;
//        }
//    }
//    public Node kthAtEnd(int k){
//        if( head==null){
//            return null;
//        }
//        Node slow = head;
//        Node kp = head;
////        for(int i=0;i<k;i++){
////            if(fast == null){
////                return null;
////            }
////            fast = fast.next;
////        }
//        int c = k;
//        while(c-->0){
//            kp = kp.next;
//        }
//        while (kp!=null){
//            slow = slow.next;
//            kp = kp.next;
//        }
//        return slow;
//    }
//    public void findLoop(){
//        if(head==null || head.next==null){
//            return;
//        }
//        Node slow = head;
//        Node fast = head;
//        int flag = 0;
//        while (fast!=null && fast.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow==fast){
//                flag=1;
//                break;
//            }
//        }
//        if(flag==1){
//            System.out.println("Loop Found");
//        }else{
//            System.out.println("Loop Not found");
//        }
//    }
//
//
//
//}
//public class linked_List1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        LinkedList linkedList = new LinkedList();
//        System.out.println("Enter the elements: ");
//        int data=sc.nextInt();
//            while(data!=-1) {
//                linkedList.append(data);
//                data = sc.nextInt();
//            }
//
//        System.out.print("Linked List: ");
//
//        linkedList.display();
//        System.out.println();
////        System.out.print("Enter value of k: ");
////        int k = sc.nextInt();
////        Node kthNode = linkedList.kthAtEnd(k);
////        if(kthNode!=null){
////            System.out.println(kthNode.data);
////        }
//
//            linkedList.findLoop();
//
//
//    }
//}
