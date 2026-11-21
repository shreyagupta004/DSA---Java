public class H_02_RotateLL {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = converArr2LL(arr);
        head = rotateLL(head, 3);
        print(head);
    }
    public static Node rotateLL(Node head, int k){
        Node tail = head;
        int len = 1;
        while(tail.next != null){
            tail = tail.next;
            len++;
        }
        if(k % len == 0) return head;
        k = k % len;
        tail.next = head;

        Node newLastNode = findKthNode(head, len - k);
        head = newLastNode.next;
        newLastNode.next = null;

        return head;
    }
    public static Node findKthNode(Node tail, int k){
        int cnt = 1;
        while(tail != null){
            if(cnt == k) return tail;
            cnt++;
            tail = tail.next;
        }
        return tail;
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
