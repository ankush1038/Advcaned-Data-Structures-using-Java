//import java.util.Scanner;
//
//class Node{
//    int data;
//    Node next;
//    public Node(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//class linkedList{
//    Node head;
//    public void addNode(int data){
//        Node newNode = new Node(data);
//        if(head==null){
//            head = newNode;
//            return;
//        }
//        Node curr = head;
//        while(curr.next!=null){
//            curr = curr.next;
//        }
//        curr.next=newNode;
//    }
//    public void print(){
//        Node curr=head;
//        while(curr!=null){
//            System.out.print(curr.data+"->");
//
//            curr=curr.next;
//        }
//        System.out.println();
//    }
//    public void deleteNthNode(int n){
//        Node slow = head;
//        Node kp = head;
//        int count = n;
//        while(count-->0){
//            kp=kp.next;
//        }
//        while(kp.next!=null){
//            slow = slow.next;
//            kp = kp.next;
//        }
//        slow.next= slow.next.next;
//        print();
//    }
//}
//
//public class ll2 {
//    public static void main(String[] args) {
//        linkedList ll = new linkedList();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter elements" +
//                " (enter -1 to terminate): ");
//
//        int data = sc.nextInt();
//        while (data != -1) {
//            ll.addNode(data);
//
//            data = sc.nextInt();
//        }
//        System.out.print("Linked list: ");
//        ll.print();
//        System.out.println("Enter nth node: ");
//        int n=sc.nextInt();
//        ll.deleteNthNode(n);
//    }
//}
