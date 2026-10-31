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
public class LL_02_Traversal {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
       
         Node head = traversal(arr);
         Node temp = head;
         while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
         }
        
    }
    public static Node traversal(int arr[]){
        Node head = new Node(arr[0]) ;
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}

