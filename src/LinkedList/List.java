package LinkedList;

public class List {
    private Node head;

    public List() {
        head = new Node();
    }

    /**
     * 通过尾插法向链表中添加node节点
     *
     * @param node 添加到node
     */
    public void addNode(Node node) {
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(node);
    }

    /**
     * 遍历链表
     */
    public void lookNode() {
        Node temp = head;
        while (temp.getNext() != null) {
            System.out.println(temp.getNext());
            temp = temp.getNext();
        }
    }

    /**
     * 根据id添加元素 id是从小到大
     * @param node 添加的元素
     */
    public void addByIdNode(Node node) {
        Node temp = head;
        while (true) {
            if (temp.getNext() == null) {
                temp.setNext(node);
                break;
            }
            if (temp.getNext().getId()>node.getId()) {
                node.setNext(temp.getNext());
                temp.setNext(node);
                break;
            } else if (node.getId() == temp.getNext().getId()) {
                throw new RuntimeException("在链表中，id为"+node.getId()+"的元素，已存在。");
            }
            temp=temp.getNext();
        }
    }

    /**
     * 根据id修改节点信息
     * @param node id值
     */
    public void updateNode(Node node){
        Node temp=head;
        while (true){
            if (head.getNext()==null){
                throw new RuntimeException("链表为空，无法执行修改操作");
            }
            if (temp.getNext().getId()==node.getId()){
                temp.getNext().setData(node.getData());
                break;
            }
            temp=temp.getNext();
            if (temp.getNext()==null){
                throw new RuntimeException("链表中，无id为"+node.getId()+"的元素，无法执行修改操作");
            }
        }
    }

    /**
     *根据id删除节元素
     * @param id id值
     */
    public void deleteNode(int id){
        Node temp=head;
        while (true){
            if (head.getNext()==null){
                throw new RuntimeException("链表为空，无法执删除操作");
            }
            if (temp.getNext().getId()==id){
                temp.setNext(temp.getNext().getNext());
                break;
            }
            temp=temp.getNext();
            if (temp.getNext()==null){
                throw  new RuntimeException("链表中，无id为"+id+"的元素，无法执行删除操作");
            }
        }
    }
}
