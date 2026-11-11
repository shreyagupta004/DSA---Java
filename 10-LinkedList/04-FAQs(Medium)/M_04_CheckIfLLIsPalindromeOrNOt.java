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

public class M_04_CheckIfLLIsPalindromeOrNOt {
    public static void main(String[] args) {
        int arr[] = {1,2,6,2,1};
        Node head = convertArr2LL(arr);
        System.out.println(isPalindrome(head));


    }
    public static boolean isPalindrome(Node head) {

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = reverse(slow.next);
        Node first = head;
        Node second = newHead;
        while(second != null){
            if(first.data != second.data) {
                reverse(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverse(newHead);

        return true;
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
