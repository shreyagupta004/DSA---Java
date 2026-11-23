public class Node {
    int data;
    Node next;
    Node child;
    Node(int data, Node next, Node child){
        this.data = data;
        this.next = next;
        this.child = child;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
        this.child = null;
    }
    Node(int data){
        this.data = data;
        this.next = null;
        this.child = null;
    }
}
