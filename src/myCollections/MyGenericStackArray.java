package myCollections;

public class MyGenericStackArray<T> {

    int size;
    int top;
    public static final int CAPACITY = 2;
    T[] array;

    public MyGenericStackArray() {
        this(CAPACITY);
    }

    public MyGenericStackArray(int cap) {
        this.size = cap;
        top = -1;
        array = (T[]) new Object[cap];
    }

    public void push(T data) {
        if (top + 1 == size) {
            T[] newArray = (T[]) new Object[size * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            size = size * 2;
        }
        top++;
        array[top] = data;
    }

    public T pop() {
        if (isEmpty()) return null; // throw ex
        T data = array[top];
        top--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T peek() {
        if (isEmpty()) return null;
        return array[top];
    }

    public static void main(String[] args) {

    }
}
