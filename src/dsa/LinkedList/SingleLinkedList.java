package dsa.LinkedList;

public class SingleLinkedList {
    Node head = null;
    Node tail = null;

    public void addTails(int data) {
        Node temp = new Node(data);//gagawa ng panibagong node na may laman ng data(ung argument).
        if (head == null && tail == null) {
            head = temp;
            tail = temp;
        } else {
            tail.nextNode = temp;
            tail = temp;
        } //else
    }
    public void addHead(int data) {
        Node temp = new Node(data);//gagawa ng panibagong node na may laman ng data(ung argument).
        temp.nextNode = head;
        head = temp;
    } //end of addHead
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.nextNode;
        }
    }
    public void replace (int data, int index){
        Node temp = head;
        while(index != 0) { //pang get dun sa index na ininput
            temp = temp.nextNode;
            index--;
        }
        temp.data = data;
    }
} //end of SingleLinkedList
