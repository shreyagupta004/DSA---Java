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
public class D_02_DeletionAtTail {
    public static void main(String[] args) {
        int arr[] = {2,5,4,1,6};
        Node head = convertArr2LL(arr);
        head = deleteTail(head);
        print(head);
    }
    public static Node deleteTail(Node head){
        if(head == null) return null;
        if(head.next == null) return null;
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
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
