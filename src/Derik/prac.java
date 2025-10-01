package Derik;

class Nodes{
    int data;
    Nodes next;
}

public class prac {

    Nodes head;

    void insertData(int data){

        Nodes node = new Nodes();
        node.data = data;

        if(head == null){
            head = node;
        }else{

            Nodes n = head;

            while(n.next!=null) n = n.next;

            n.next = node;

        }

    }
    void insertAtStart(int data){
        Nodes node = new Nodes();
        node.data = data;

        node.next = head.next;
        head = node;

    }

    void insertAtIndex(int data, int index){
        Nodes node = new Nodes();

        node.data = data;

        if(index > count()){
            System.out.println("Too large, womp womp");
            return;
        };

        if(index == 0) insertData(data);
        else{

            for (int i = 0; i < index; i++) {

                node = node.next;

            }

        }

    }

    void delete(int index){

        Nodes node = head;

    }

    int count(){

        int ctr = 0;
        Nodes node = head;

        while(node != null){
            ctr++;
            node = node.next;
        }

        return ctr;

    }

}
