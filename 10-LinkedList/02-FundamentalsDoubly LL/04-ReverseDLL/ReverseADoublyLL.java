class Node{
    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class ReverseADoublyLL {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = convertArr2DLL(arr);
        head = reverseDLL(head);
        print(head);
    }
    public static Node reverseDLL(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node last = null;
        Node current = head;
        while(current != null){
            last = current.prev;
            current.prev = current.next;
            current.next = last;
            current = current.prev;
        }
        return last.prev;
    }
    public static Node convertArr2DLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i], null, mover);
            mover.next = temp;
            mover = temp; 
        }
        return head;
    }
    public static void print(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
