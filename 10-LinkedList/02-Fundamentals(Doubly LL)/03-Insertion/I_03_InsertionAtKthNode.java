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
public class I_03_InsertionAtKthNode {
    public static void main(String[] args) {
        int arr[] = {1,4,2,6,7};
        Node head = convertArr2DLL(arr);
        head = insertBeforeKthNode(head, 100, 3);
        print(head);
    }
    public static Node insertBeforeKthNode(Node head,int val, int k){
        if(k == 1){
            return new Node(val, head, null);
        }
        Node temp = head;
        int cnt  = 0;
        while(temp != null){
            cnt++;
            if(cnt == k) break;
            else temp = temp.next;
        }
        Node back = temp.prev;
        Node newNode = new Node(val, temp, back);
        back.next  = newNode;
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
