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
public class I_01_InsertionAtHead {
    public static void main(String[] args) {
        int arr[] = {1,4,6,2,8};
        Node head = convertArr2LL(arr);
        head = insertAtHead(head, 100);
        print(head);
    }
    public static Node insertAtHead(Node head, int val){
        Node temp = new Node(val, head);
        return temp;
    }
    public static Node convertArr2LL(int arr[]){
        if (arr.length == 0) return null;
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
