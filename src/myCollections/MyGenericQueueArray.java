package myCollections;

public class MyGenericQueueArray<T> {
    private final static int INITIAL_CAPACITY = 5;
    Object[] queueArr = new Object[INITIAL_CAPACITY];
    private int size;

    public MyGenericQueueArray() {
        this.size = 0;
    }

    public void enqueue(T data) {
        if (size == queueArr.length) {
            Object[] newArray = new Object[(queueArr.length * 2)];
            for (int i = 0; i < queueArr.length; i++) {
                newArray[i] = queueArr[i];
            }
            queueArr = newArray;
            System.out.println("size increased");
        }
        queueArr[size] = data;
        size++;
        System.out.println("data added " + data);
    }

    public T dequeue() {
        if (size == 0) {
            System.out.println("queue is empty");
            return null;
        }
        T data = (T) queueArr[0];
        for (int i = 0; i < size - 1; i++) {
            queueArr[i] = queueArr[i + 1];
        }
        size--;
        System.out.println("data removed " + data);
        return data;
    }

    public static void main(String a[]) {
        MyGenericQueueArray<Integer> queue = new MyGenericQueueArray<>();
        queue.dequeue();
        queue.enqueue(1);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(5);
        queue.dequeue();
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();
        queue.enqueue(8);
        queue.enqueue(9);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}