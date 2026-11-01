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
public class D_03_DeletionAtKthElement {
    public static void main(String[] args) {
        int arr[] = {2,1,4,6,7};
        Node head = convertArr2DLL(arr);
        head = deleteAtKthElement(head, 1);
        print(head);
    }
    
    
    public static Node deleteAtKthElement(Node head, int k){
        if(head == null) return null;
        Node temp = head;
        int counter = 0;
        while(temp != null){
            counter++;
            if(counter == k) break;
            else temp = temp.next;
        }
        Node back = temp.prev;
        Node front = temp.next;
        if(back == null && front == null) return null;
        
        else if(back == null){
            head = head.next;
            head.prev = null;
        }
        else if(front == null){
            head = back;
            back.prev = null;
            temp.next = null;
            
        }
        else{
            back.next = front;
            front.prev = back;
            temp.next = null;
            temp.prev = null;

        }
        return head;
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
