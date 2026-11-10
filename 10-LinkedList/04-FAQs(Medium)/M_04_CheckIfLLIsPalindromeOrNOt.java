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
        int arr[] = {1,2,1};
        Node head = convertArr2LL(arr);
        System.out.println(isPalindrome(head));


    }
    public static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;

        // Find the middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // For an odd-length list, skip the middle node
        if (fast != null) {
            slow = slow.next;
        }

        // Reverse the second half
        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Compare both halves
        Node left = head;
        Node right = prev;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
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
