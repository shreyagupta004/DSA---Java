public class M_08_FindLengthOfLoop {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Node head = convertArr2LL(arr);
        Node loopHead = head.next.next.next;
        Node tail = head;
        while(tail.next != null) tail = tail.next;
        tail.next = loopHead;
        int res = findLength(loopHead, tail);
        System.out.println(res);
    }
    public static int findLength(Node fast, Node slow){
        int count = 1;
        fast = fast.next;
        while(slow != fast){
            count++;
            fast = fast.next;
        }
        return count;
    }
    public static int loop(Node head){
        Node fast = head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return findLength(fast, slow);
        }
        return 0;
    }
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp =temp.next;
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
