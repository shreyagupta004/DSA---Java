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
public class I_02_InsertionBeforeTail {
    public static void main(String[] args) {
        int arr[] = {1,4,2,6,7};
        Node head = convertArr2DLL(arr);
        head = insertBeforeTail(head, 100);
        print(head);
    }
    public static Node insertBeforeTail(Node head, int val){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node back = temp.prev;
        Node newNode = new Node(val, temp, back);
        back.next = newNode;
        temp.prev = newNode;
        return head;
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
