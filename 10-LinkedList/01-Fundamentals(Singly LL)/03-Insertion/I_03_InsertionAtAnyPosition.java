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
public class I_03_InsertionAtAnyPosition {
    public static void main(String[] args) {
        int arr[] = {1,4,6,2,8};
        Node head = convertArr2LL(arr);
        head = insertAtAnyPosition(head, 100, 4);
        print(head);
    }
    public static Node insertAtAnyPosition(Node head, int val, int pos){
        if(head == null) {
            if(pos == 1) return new Node(val);
            else return head;
        }
        if(pos == 1){
            return new Node(val);
        }
        int counter = 0;
        Node temp = head;
        while(temp != null){
            counter++;
            if(counter == pos - 1){
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
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
