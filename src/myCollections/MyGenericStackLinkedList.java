package myCollections;

public class MyGenericStackLinkedList<T> {

    private Node<T> top;

    public MyGenericStackLinkedList() {
        top = null;
    }

    public void push(T e) {
        Node<T> node = new Node<>(e);
        node.next = top;
        top = node;
        System.out.println(node.value + " added");
    }
    public T pop() {
        if (top==null) {
            System.out.println("stack is empty");
            return null;
        }
        T data = top.value;
        top = top.next;
        System.out.println(data + " returned");
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
        T value;
        Node<T> next;
        Node(T value) {
            this.value = value;
            next = null;
        }
    }
}