class Node{
    int data;
    Node next;
    
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
public class LL_04_LengthOfLinkedList {
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,7,3};
        Node head = new Node(arr[0], null);
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i], null);
            mover.next = temp;
            mover = temp;
        }
        System.out.println(length(head));
    }
    public static int length(Node head ){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}
