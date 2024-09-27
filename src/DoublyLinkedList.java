public class DoublyLinkedList {
    private Node head, tail;
    public class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public void remove(Node n) {
        if (n == null)
            return;

        // If removing the head
        if (n == head) {
            head = n.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // List becomes empty
            }
        }
        // If removing the tail
        else if (n == tail) {
            tail = n.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null; // List becomes empty
            }
        }
        // General case: removing a node in the middle
        else if (n.prev != null && n.next != null) {
            n.prev.next = n.next;
            n.next.prev = n.prev;
        }
    }

    public void insert(Node n) {
        if (head == null) {
            head = n;
            tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println();

    }

}
