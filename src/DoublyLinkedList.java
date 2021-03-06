public class DoublyLinkedList {
    private static class Node {
        private int data;
        private Node pre;
        private Node next;

        public Node(int data, Node pre, Node next) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.pre = null;
            this.next = null;
        }

    }

    private int size = 0;
    private Node head = null;
    private Node tail = null;

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        System.out.println(linkedList);
        for (int i = 0; i < 5; i++) {
            linkedList.insert(i+1);
        }
        System.out.println(linkedList);

    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("[");
        Node temp = this.head;
        while (temp != null){
            response.append(temp.data);
            if(temp.next != null)
            {
                response.append(" <==> ");
            }
            
            temp = temp.next;
        }
        response.append("]");
        return  response.toString();
    }
    public void insertHead(int data){
    /*Node newNode = new Node(data, null, this.head);
    this.head = newNode;*/
    this.head = new Node(data, null, this.head);
    size++;
    }
    private void insertAfter(int data, Node node){
        Node newNode = new Node(data, node, this.head);
        node.next = newNode;
        newNode.next.pre = newNode;
        size++;
    }
    public void insert(int data){
        if(head == null){
            insertHead(data);
        }
        else
        {
            Node temp = this.head;
            while (temp != null){
                temp = temp.next;
            }
            insertAfter(data, temp);
        }
    }
}
