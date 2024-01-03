package LinkListClass;
import java.util.*;
public class middleOfTheElement {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class linklist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.next + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
            return;
        }
        int middleEle(){
            Node slow=head;
            Node fast=head;
            while(fast!= null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow.data;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            linklist ll=new linklist();
            int size=sc.nextInt();
            for(int i=0;i<size;i++){
                int data=sc.nextInt();
                ll.insertAtEnd(data);
            }
        System.out.println(ll.middleEle());
    }
}
