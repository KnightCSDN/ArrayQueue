package LinkedList;

public class List {

    Node head;

    public List() {
        head=new Node();
    }

    /**
     * 往链表中添加node节点
     * @param node 添加到node
     */
    public void addNode(Node node){
        Node temp=head;
        while (temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(node);
    }

    /**
     * 遍历链表
     */
    public void lookNode(){
        Node temp=head;
        while (temp.getNext()!=null){
            System.out.println(temp.getNext());
            temp=temp.getNext();
        }
    }

}
