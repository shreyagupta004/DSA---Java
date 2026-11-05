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
public class M_01_AddOne {
    public static void main(String[] args) {
        int arr[] = {9,9,9};
        Node head = convertArr2LL(arr);
        head = addOne(head);
        print(head);
    }
    //iterative approach---
    public static Node addOne(Node head){
        head = reverseLL(head);
        Node temp = head;
        int carry = 1;
        while(temp != null){
            temp.data += carry;
            if(temp.data < 10){
                carry = 0;
                break;
            } else{
                temp.data = 0;
                carry = 1;
            }
            temp = temp.next;
        }
        if(carry == 1){
            Node newNode = new Node(carry);
            head = reverseLL(head);
            newNode.next = head;
            return newNode;
        }
        head = reverseLL(head);
        return head;
        
    }
    public static Node reverseLL(Node head){
        if(head == null || head.next == null) return head;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp =temp.next;
        }
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

}
