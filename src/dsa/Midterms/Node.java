package dsa.Midterms;

public class Node {
    private String name;
    private Node nextNode;

    Node(String name){ //Constructor
        this.name = name;
        nextNode = null;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Node getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

}
