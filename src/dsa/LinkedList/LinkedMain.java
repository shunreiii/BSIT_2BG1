package dsa.LinkedList;

public class LinkedMain {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        list.addTails(5);
        list.addTails(10);
        list.addTails(15);
        list.addTails(20);
        list.addTails(25);
        list.display();

        System.out.println("\n");
        list.replace(100, 3);
        list.display();
    }
}
