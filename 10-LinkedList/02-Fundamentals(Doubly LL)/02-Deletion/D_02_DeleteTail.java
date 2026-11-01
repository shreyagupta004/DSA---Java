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
public class D_02_DeleteTail {
    public static void main(String[] args) {
        int arr[] = {2,1,4,6,7};
        Node head = convertArr2DLL(arr);
        head = deleteTail(head);
        print(head);
    }
    public static Node deleteTail(Node head){
        if(head == null) return null;
        if(head.next == null) return null;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
            Node tail = temp.prev;
            temp.prev = null;
            tail.next = null;
            return head;
    }
    public static Node convertArr2DLL(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
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
