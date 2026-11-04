class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next =null;
    }
}
public class LB_03_SortLL{
    public static void main(String[] args) {
        int arr[] = {1,0,2,2,1,0,2,1,1,0,0};
        Node head = convertArr2LL(arr);
        head = sortLL(head);
        print(head);
    }
    public static Node sortLL(Node head){
        if(head == null) return null;
        if(head.next == null) return head;
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;
        Node temp = head;

        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = temp;
            }
            if(temp.data == 1){
                one.next = temp;
                one = temp;
            } 
            if(temp.data == 2){
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        if(oneHead.next != null) zero.next = oneHead.next;
        else zero.next = twoHead.next;
        
        one.next = twoHead.next;
        two.next = null;
        
        Node newHead = zeroHead.next;
        return newHead;         
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
