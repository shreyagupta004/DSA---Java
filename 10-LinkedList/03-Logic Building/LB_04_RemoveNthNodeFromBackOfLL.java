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
public class LB_04_RemoveNthNodeFromBackOfLL {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,5,6};
        Node head = convertArr2LL(arr);
        head = removeNode(head, 6);
        print(head);
    }
    public static Node removeNode(Node head, int N){
        if(head == null || head.next == null) return null;
        Node fast = head;
        for(int i = 0; i < N; i++) fast = fast.next;
        Node slow = head ;
        if(fast == null) return head.next;
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
         
        return head;
    }
    public static Node convertArr2LL(int arr[]){
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
