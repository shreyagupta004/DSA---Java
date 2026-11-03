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
public class LB_01_AddTwoNumInLL {
    public static void main(String[] args) {
        int arr1[] = {2,4,3};
        int arr2[] = {5,6,4};
        Node head1 = convertArr2LL(arr1);
        Node head2 = convertArr2LL(arr2);
        Node res = addTwoNum(head1, head2);
        print(res);
     }
    public static Node addTwoNum(Node head1, Node head2){
        Node t1 = head1;
        Node t2 = head2;
        Node dummyNode = new Node(-1);
        Node curr = dummyNode;
        int carry = 0;
        while(t1 != null && t2 != null){
            int sum = carry;
            if(t1 != null) sum = sum + t1.data;
            if(t2 != null) sum = sum + t2.data;
            Node newNode = new Node(sum % 10);
            carry = sum / 10;
            curr.next = newNode;
            curr = curr.next;
            if(t1 != null) t1 = t1.next;
            if(t2 != null) t2 = t2.next;
        }
        if(carry != 0){
            Node newNode = new Node(carry);
            curr.next = newNode;
        }
        return dummyNode.next;
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
