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
public class M_06_DetectALoopInLL {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        Node head = convertArr2LL(arr);
        Node loopNode = head.next.next;
        Node tail = head;
        while (tail.next != null) {
        tail = tail.next;
        }
        tail.next = loopNode;
        if(detectLopp(head)){
            System.out.println("loop detected");
        }
        else System.out.println("loop not detected");
    }
    public static boolean detectLopp(Node head){
        Node fast = head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) return true;
        }
        return false;
    }
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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
}
