package myCollections;

public class MyGenericStackLinkedList<T> {

    private Node<T> top;

    public MyGenericStackLinkedList() {

        top = null;
    }

    public void push(T e) {
        Node<T> node = new Node<>(e);
        node.setReference(top);
        top = node;
    }
    public T pop() {
        if (top==null) {
            return null;
        }
        T data = top.getValue();
        top = top.getReference();
        return data;
    }

    public static void main(String[] args) {
        MyGenericStackLinkedList<Integer> stack = new MyGenericStackLinkedList<>();
        stack.pop();
        stack.push(1);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.push(5);
        stack.pop();
        stack.push(6);
        stack.push(7);
        stack.pop();
        stack.push(8);
        stack.push(9);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }

    private static class Node<T> {
        public T value;
        public Node<T> reference;

        public Node(T value) {
            this.value = value;
            reference = null;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getReference() {
            return reference;
        }

        public void setReference(Node<T> reference) {
            this.reference = reference;
        }
    }
}