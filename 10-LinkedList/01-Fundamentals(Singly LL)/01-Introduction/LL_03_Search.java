class Node{
    int data;
    Node next;
    
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
public class LL_03_Search {
    public static void main(String[] args) {
        int arr[] = {1,5,2,5,7};
        Node head =  new Node(arr[0], null);
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i], null);
            mover.next = temp;
            mover = temp;
        }
        System.out.println(search(head, 5));
    }
    public static boolean search(Node head, int key){
       Node temp = head;
       while(temp != null){
        if(temp.data == key) return true;
            temp = temp.next;
       }
       return false;
    }
}
