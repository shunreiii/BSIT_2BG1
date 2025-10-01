package dsa.Midterms;

public class SingleLinkedList {
    private Node head;
    private Node tail;

    SingleLinkedList(){
        head = null;
        tail = null;
    }

    public void addTails(String name) {
        Node temp = new Node(name);
        if (head == null && tail == null) {
            head = temp;
            tail = temp;
        } else {
            tail.setNextNode(temp);
            tail = temp;
        } //else
    } //end of addTails

    public void addHeads(String name) {
        Node temp = new Node(name);
        temp.setNextNode(head.getNextNode());
        head = temp;
    } //end of addHead

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getName() + " -> ");
            temp = temp.getNextNode();
        }
        System.out.print("null");
    }

    public void replace(String name, int index){
        Node temp = head;
        while(index != 0){
            temp = temp.getNextNode();
            index--;
        }
        temp.setName(name);
    }

} //end of SingleLinkedList
