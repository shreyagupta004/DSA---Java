public class H_03_MergeTwoSortedLL {
    public static void main(String[] args) {
        int arr1[] = {2,4,7};
        int arr2[] = {0,1,3,5,8,9};
        Node head1 = converArr2LL(arr1);
        Node head2 = converArr2LL(arr2);
        Node head = merge2SortedLL(head1, head2) ;
        print(head);
    }
    public static Node merge2SortedLL(Node list1, Node list2){
        Node t1 = list1, t2 = list2;
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        while(t1 != null && t2 != null){
            if(t1.data < t2.data) {
                temp.next = t1; 
                temp = t1;
                t1 = t1.next;
            }else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1 != null) temp.next = t1;
        else temp.next = t2;
        return dummyNode.next;
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
