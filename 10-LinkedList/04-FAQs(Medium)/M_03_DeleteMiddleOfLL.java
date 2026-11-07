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
public class M_03_DeleteMiddleOfLL {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Node head = convertArr2LL(arr);
        head = deleteMiddle(head);
        print(head);
    }
    //optimal apperoach---
    public static Node deleteMiddleNode(Node head){
        Node fast = head, slow = head;
        fast = fast.next.next;
        while(fast != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static Node deleteMiddle(Node head){
        if(head == null || head.next ==  null) return null;
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int res = count / 2;
        temp = head;
        while(temp != null){
            res--;
            if(res == 0){
                temp.next = temp.next.next;
            }
            temp = temp.next;
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
