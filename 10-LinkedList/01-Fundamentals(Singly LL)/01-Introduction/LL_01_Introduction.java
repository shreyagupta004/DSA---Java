public class LL_01_Introduction {
    public static void main(String[] args) {
        int arr[] = {1,5,2,6,7};
        Node n = new Node(arr[4 ],null);
        System.out.println(n.data);

        Node node = new Node(arr[1]);
        System.out.println(node.data);
    }
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
