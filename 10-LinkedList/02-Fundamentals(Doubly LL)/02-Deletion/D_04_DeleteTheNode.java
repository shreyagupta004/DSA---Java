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
public class D_04_DeleteTheNode {
    public static void main(String[] args) {
        int arr[] = {2,1,4,6,7};
        Node head = convertArr2DLL(arr);
        deleteNode(head.next);
        print(head);
    }
    public static void deleteNode(Node temp){
        Node back = temp.prev;
        Node front = temp.next;
        if(front == null){
            back.next = null;
            temp.prev = null; 
        }
        
        back.next = front;
        front.prev = back;

        temp.prev = null;
        temp.next = null;
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
