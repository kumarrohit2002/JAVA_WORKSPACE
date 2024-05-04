package Queue.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class example {
    public static void  priorityQ(){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(7);
        pq.add(9);
        System.out.println(pq);
        System.out.println(pq.peek()); //7 is smallest is highest priority
        System.out.println(pq.poll()); //remove 7
        System.out.println(pq.peek());

        System.out.println("----------------------------------");

        PriorityQueue<Integer> pqm=new PriorityQueue<>(Comparator.reverseOrder());
        pqm.add(30);
        pqm.add(10);
        pqm.add(20);
        System.out.println(pqm);
        System.out.println(pqm.peek());  // 30 is biggest is gighest priority
        System.out.println(pqm.poll());
        System.out.println(pqm);



    }
    public static void main(String[] args) {
        priorityQ();
    }
}
