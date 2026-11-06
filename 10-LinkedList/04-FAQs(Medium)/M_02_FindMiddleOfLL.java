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
public class M_02_FindMiddleOfLL {
    public static void main(String[] args) {
        int arr[] = {1,4,6,2,8};
        Node head = convertArr2LL(arr);
        head = findMiddle(head);
        print(head);
    }//optimal approach---
    public static Node find(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node findMiddle(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        int middNode = (count / 2) + 1;
        while(temp != null){
            middNode = middNode - 1;
            if(middNode == 0) break;
            else temp = temp.next;
        }
        return temp;
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
