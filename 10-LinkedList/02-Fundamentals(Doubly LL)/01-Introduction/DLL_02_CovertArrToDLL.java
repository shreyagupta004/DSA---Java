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
public class DLL_02_CovertArrToDLL {
    public static void main(String[] args) {
        int arr[] = {2,1,4,6,3};
        Node head = convertArr2DLL(arr);
        head = insertAtHead(head, 100);
        print(head);
    }
    public static Node insertAtHead(Node head, int val){
       Node newHead = new Node(val, head, null);
       head.prev = null;
       return newHead;
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
