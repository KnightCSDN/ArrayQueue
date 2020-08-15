public class ArrayQueue {
    //队列的最大长度
    private int maxSize;
    //队列头部
    private int front;
    //队列尾部
    private int rear;
    //模拟队列的数组
    private int[] queue;

    /**
     * 初始化队列
     * @param size 初始化队列的长度
     * 并且对front、rear、maxSize进行初始化。
     */
    public ArrayQueue(int size) {
        this.queue=new int[size];
        this.front=0;
        this.rear=0;
        this.maxSize=size;
    }

    /**
     * isFull方法是判断队列是否已满
     * @return true代表已满，false代表还未满
     */
    public boolean isFull(){
        return (rear+maxSize-front)%maxSize==front;
    }

    /**
     * isEmpty方法是判断队列是否为空
     * @return true代表队列是空队列，false代表队列内存有元素
     *
     */
    public boolean isEmpty(){
        return this.front==this.rear;
    }

    /**
     * addQueue方法是往队列中添加元素
     * 业务逻辑判断：首先判断队列是否已满
     *            如果队列已满，将抛出RuntimeException异常
     *            如果队列不是满的，先把元素添加到队列中，并对rear+1对maxSize进行取余处理。
     * @param data 往队列中添加的那个元素
     */
    public void addQueue(int data){
        if (isFull()){
            throw new RuntimeException("队列已满，无法添加元素");
        }
        queue[rear]=data;
        rear=(rear+1)%maxSize;
    }

    /**
     * getQueue方法是从队列中取出对头部元素
     * @return 返回头部取出的元素
     * 业务逻辑判断：
     *          首先判断队列是否为空
     *          如果队列为空，将抛出RuntimeException异常
     *          如果队列不为空，先取出元素并用data转存，然后对front+1，需要front+1进行取余处理。
     */
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列为空队列，无法取出元素");
        }
        int data=queue[front];
        front=(front+1)%maxSize;
        return data;
    }

    /**
     * 查看队首元素
     * @return 返回队首元素
     */
    public int LookQueueFront(){
        return queue[front];
    }
    /**
     * printQueue方法是遍历并打印数组的元素
     */
   public void printQueue(){
        for (int i=front;i<=front+(rear+maxSize-front)%maxSize;i++){
            System.out.println(queue[i%maxSize]);
        }
   }
}
