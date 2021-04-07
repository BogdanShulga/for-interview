package myCollections;

class MyGenericQueueLinkedList<T> {
    QNode<T> front, rear;
    public MyGenericQueueLinkedList() {
        this.front = this.rear = null; 
    }
    void enqueue(T key)
    { 
        QNode<T> temp = new QNode<>(key);
        if (front == null) {
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }
    T dequeue()
    {
        if (front == null) return null;
        QNode<T> temp = front;
        if(front == rear){
            front = null;
            rear = null;
        }
        else{
            front = front.next;
        }
        return temp.key;


    }

    static private class QNode<T> {
        T key;
        QNode<T> next;
        public QNode(T key) {
            this.key = key;
            this.next = null;
        }
    }

    public static void main(String[] args)
    {
        MyGenericQueueLinkedList<Integer> q = new MyGenericQueueLinkedList<>();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue Rear : " + q.rear.key);
    }
}