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
public class I_04_InsertElementBeforeValueX {
    public static void main(String[] args) {
        int arr[] = {1,4,6,2,8};
        Node head = convertArr2LL(arr);
        head = insertElementBeforeValueX(head, 100, 4);
        print(head);
    }
    public static Node insertElementBeforeValueX(Node head, int val, int x){
        if(head == null) return null;
        if(head.data == x){
            return new Node(val, head);
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == x){
                Node newnode = new Node(val);
                newnode.next = temp.next;
                temp.next = newnode;
                break;
            }
        }
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
