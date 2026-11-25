public class H_04_FlatteningLL {
    public static void main(String[] args) {
        
    Node head = new Node(1);
    head.child = new Node(4);
    head.child.child = new Node(7);

    head.next = new Node(2);
    head.next.child = new Node(5);

    head.next.next = new Node(3);
    head.next.next.child = new Node(6);

    print(flattenigLL(head));
    }
    public static Node flattenigLL(Node head){
        if(head == null || head.next == null) return head;
        Node mergedHead = flattenigLL(head.next);
        return merge(head , mergedHead);
    }
    public static Node merge(Node list1, Node list2){
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        while(list1 != null && list2 != null){
            if(list1.data < list2.data){
                res.child = list1;
                list1 = list1.child;
            }
            else{
                res.child = list2;
                list2 = list2.child;
            }
            res = res.child;
            res.next = null;
        }
        if(list1 != null) res.child = list1;
        else res.child = list2;
        if(dummyNode.child != null) dummyNode.child.next = null;
        return dummyNode.child;
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
            temp = temp.child;
        }
    }
}
