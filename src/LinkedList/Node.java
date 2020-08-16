package LinkedList;

public class Node {
    private int id;
    private Object data;
    private Node next;

    public Node() {
    }

    public Node(int id, Object data) {
        this.id = id;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", data=" + data +
                '}';
    }
}
