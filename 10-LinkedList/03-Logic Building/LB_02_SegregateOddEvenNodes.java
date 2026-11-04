import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LB_02_SegregateOddEvenNodes{
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,5,6};
        Node head = convertArr2LL(arr);
        //head = oddEvenLL(head);
        head = oddEvenNode(head);
        print(head);
    }
    //optimal--
    public static Node oddEvenNode(Node head){
        if(head == null) return null;
        if(head.next == null) return head;
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    //brute force--
    public static Node oddEvenLL(Node head){
        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp != null && temp.next != null){
            list.add(temp.data);
            temp = temp.next.next;
        }
        if(temp != null) list.add(temp.data);

        temp = head.next;
        while(temp != null && temp.next != null){
            list.add(temp.data);
            temp = temp.next.next;
        }
        if(temp != null) list.add(temp.data);

        int i = 0 ;
        temp = head;
        while(temp != null){
            temp.data = list.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
    public static Node convertArr2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}