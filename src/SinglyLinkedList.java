import java.util.ArrayList;

public class SinglyLinkedList {

    private class Node{

        private int data;
        private Node next;

        public Node(int data) {
        this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head = null;
    private int size =0;

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        System.out.println(linkedList);
    }
    @Override
    public String toString() {
       StringBuilder response = new StringBuilder();
       response.append("[");
       Node temp = this.head;
       while(temp != null){
           response.append(temp.getData());
           temp = temp.next;
       }



       response.append("]");
       return response.toString();

    }
    private void insertHead(int data)
    {
     Node newNode = new Node(data, this.head);
     this.head = newNode;
     size++;
    }
}
