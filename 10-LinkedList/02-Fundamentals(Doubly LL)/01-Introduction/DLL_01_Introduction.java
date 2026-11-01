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
public class DLL_01_Introduction {
    public static void main(String[] args) {
        int arr[] = {1,5,2,7,9};
        Node newNode = new Node(arr[3]);
        System.out.println(newNode.data);
    }
}
