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
public class M_05_FindIntersectionPoint {
    public static void main(String[] args) {
        int arr1[] = {4,1,8,4,5};
        int arr2[] = {5,6,1,8,4,5};
        Node head1 = convertArr2LL(arr1);
        Node shared = head1.next;
        Node head2 = new Node(5, new Node(6, shared));
        Node head = findIntersection(head1, head2);
        if(head != null) System.out.println("intersection point: " + head.data);
        else System.out.println("no intersection point.");
    }
    public static Node findIntersection(Node head1, Node head2){
        if(head1 == null || head2 == null) return null;
        Node t1 = head1;
        Node t2 = head2;
        while(t1 != t2){
            t1 = t1.next;
            t2 = t2.next;
            if(t1 == t2) return t1;
            if(t1 == null) t1 = head2;
            if(t2 == null) t2 = head1;
        }
        return t1;
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
