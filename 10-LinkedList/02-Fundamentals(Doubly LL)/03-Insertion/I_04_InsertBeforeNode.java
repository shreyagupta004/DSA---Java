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
public class I_04_InsertBeforeNode {
    public static void main(String[] args) {
        int arr[] = {1,4,2,6,7};
        Node head = convertArr2DLL(arr);
        insertBeforeNode(head.next.next, 100);
        print(head);
    }
    public static void insertBeforeNode(Node node, int val){
        Node back = node.prev;
        Node newNode = new Node(val, node, back);
        back.next = newNode;
        node.prev = newNode;
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
