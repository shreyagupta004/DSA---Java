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
public class D_04_DeleteElementWithValueX {
    public static void main(String[] args) {
        int arr[] = {1,3,6,8,2,4,7};
        Node head = convertArrToLL(arr);
        head = deleteElementWithValueX(head, 7);
        print(head);
    }
    public static Node deleteElementWithValueX(Node head, int val){
        if(head == null) return null;
        if(head.data == val) {
            head = head.next;
           return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data == val){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static Node convertArrToLL(int arr[]){
        if(arr.length == 0) return null; 
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
