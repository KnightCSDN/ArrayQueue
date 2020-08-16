package LinkedList;

public class NodeTest {
    public static void main(String[] args) {
        List list = new List();

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        list.addNode(a);
        list.addNode(b);
        list.addNode(c);
        list.addNode(d);
        list.lookNode();
    }
}
