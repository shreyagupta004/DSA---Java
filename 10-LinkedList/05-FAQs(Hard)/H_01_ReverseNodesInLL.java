public class H_01_ReverseNodesInLL {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        Node head = converArr2LL(arr);
        head = reverseGroup(head, k);
        print(head);
    }
    public static Node reverseGroup(Node head, int k){
        Node temp = head;
        Node prevNode = null;
        while(temp != null){
            Node kthNode = findKNode(temp, k);
            if(kthNode == null){
                if(prevNode != null)prevNode.next = temp;
                break;
            }
            Node nextNode = kthNode.next;
            kthNode.next = null;
            reverse(temp);
            if(head == temp) head = kthNode;
            else prevNode.next = kthNode;

            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }
    public static Node findKNode(Node temp, int k){
        k -= 1;
        while(temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    public static Node reverse(Node head){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public static Node converArr2LL(int arr[]){
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
