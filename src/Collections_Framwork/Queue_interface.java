package Collections_Framwork;

import java.util.LinkedList;

public class Queue_interface {

    public static void QueueInterfaceExample(){
        LinkedList<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q.peek());
        System.out.println(q.poll());  // remove 10 and print 10
        System.out.println(q.peek());
        System.out.println(q.size());
    }
    public static void main(String[] args) {
        QueueInterfaceExample();
    }
}
