package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class L1 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(70);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.remove(20));
        System.out.println(q);
        System.out.println(q.add(50));

        System.out.println(q.peek());
    }
}
