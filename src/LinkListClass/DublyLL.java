package LinkListClass;
import java.util.*;
import java.util.concurrent.ScheduledFuture;

public class DublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static class Dublylinkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
                temp.prev=tail;
            }
            tail=temp;
            size++;
            return;
        }

        void insertAtFirst(int data){
            Node temp=new Node(data);
            if(head==null){
                head=head;
            }else{
                temp.next=head;
                head.prev=temp;
            }
            head=temp;
        }

        void insertAtIdx(int idx,int data){
            if(idx==0){
                insertAtFirst(data);
                return;
            }
            if(idx==size){
                insertAtEnd(data);
                return;
            }
            if(idx<0 || idx>size){
                System.out.println("invalid index!!!");
                return;
            }
            Node a=head;
            for(int i=0;i<idx-1;i++){
                a=a.next;
            }
            Node b=new Node(data);
            Node c=a.next;
            b.next=c;
            c.prev=b;
            a.next=b;
            b.prev=a;
            return;
        }
        void display(){
            Node temp=head;
            System.out.print("head ->");
            while(temp!=null){
                System.out.print(temp.data+" <-> ");
                temp=temp.next;
            }
            System.out.println("tail");
            return;
        }
        void rdisplay(){
            Node temp=tail;
            System.out.print("tail -> ");
            while(temp!=null){
                System.out.print(temp.data+" <-> ");
                temp=temp.prev;
            }
            System.out.println("head");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Dublylinkedlist dll=new Dublylinkedlist();
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            dll.insertAtEnd(data);
        }
        dll.insertAtIdx(3,500);
        dll.display();
        dll.rdisplay();
    }
}
