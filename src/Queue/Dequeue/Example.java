package Queue.Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class Example {
    public static void dequeue(){
        Deque<Integer> dq=new LinkedList<>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addLast(100);
        dq.addLast(500);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq);
        System.out.println(dq.pollLast());
        System.out.println(dq);

    }
    public static void main(String[] args) {
        dequeue();

    }
}
