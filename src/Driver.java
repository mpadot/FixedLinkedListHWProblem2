public class Driver {
    public static void main(String[] args) {
        SinglyLinkedList listOne = new SinglyLinkedList();
        DoublyLinkedList listTwo = new DoublyLinkedList();
        System.out.println("Testing the singly linked list");
        listOne.insert(5);
        listOne.insert(10);
        listOne.insert(20);
        listOne.print();
        listOne.swap(10,20);
        listOne.print();



        System.out.println("Testing the doubly linked list");
        listTwo.insert(listTwo.new Node (7));
        listTwo.insert(listTwo.new Node (8));
        listTwo.insert(listTwo.new Node (9));
        listTwo.print();

    }
}
