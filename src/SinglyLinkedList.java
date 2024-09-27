public class SinglyLinkedList {
    private Node head;
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void swap(int x, int y) {
        if (x == y) return;

        // Find the nodes for x and y
        Node prevX = null, prevY = null, currX = head, currY = head;

        // Traverse to find x
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        // Traverse to find y
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present, do nothing
        if (currX == null || currY == null) return;

        // If x is not head
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        // If y is not head
        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public void print(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println();

    }

}
