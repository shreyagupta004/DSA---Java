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
public class D_03_DeletionAtAnyPosition {
    public static void main(String[] args) {
        int arr[] = {2,5,1,7,8,3};
        Node head = convertArr2LL(arr);
        head = deleteKthElement(head, 5);
        print(head);
    }
    public static Node deleteKthElement(Node head, int k){

        if(head == null) return null;
        if(k == 1){
            head = head.next;
            return head;
        }
        int counter = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            counter++;
            if(counter == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
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
