package myCollections;

import java.io.*;

class MyGenericCircularQueueLinkedList<T> {
    Node<T> front;
    Node<T> rear;
    public MyGenericCircularQueueLinkedList(){
        front = null;
        rear = null;
    }
    public void push(T d){
        Node<T> n = new Node<>(d);
        if(front == null) front = rear = n;
        rear.next = n;
        rear = n;
        rear.next = front;
        System.out.println(d + " pushed.");
    }
    public void pop(){
        if(front == null){
            System.out.println("Queue is empty!");
            return;
        }
        T d = front.data;
        if(front == rear){
            front = null;
            rear = null;
        }
        else{
            front = front.next;
            rear.next = front;
        }
        System.out.println(d.toString() + " popped.");
    }

    public void display(){
        if(front == null){
            System.out.println("Queue is empty!");
            return;
        }
        Node<T> n = front;
        System.out.println("Circular queue contents:");
        while(n.next != front)
        {
            System.out.print(n.data + "\t");
            n = n.next;
        }
        System.out.println(n.data);
    }

    static class Node<T>{
        T data;
        Node<T> next;
        public Node(T d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MyGenericCircularQueueLinkedList<Integer> queue = new MyGenericCircularQueueLinkedList<>();
        while(true){
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(br.readLine());
            switch(choice){
                case 1:
                System.out.print("Element to be pushed: ");
                int d = Integer.parseInt(br.readLine());
                queue.push(d);
                break;
                case 2:
                queue.pop();
                break;
                case 3:
                queue.display();
                break;
                default:
                System.out.println("Bye...");
                return;
            }
        }
    }
}