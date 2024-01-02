package LinkListClass;
import java.util.*;
public class NthNodeFromTheEnd {


    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class linklist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void insertAtFirst(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }else{
                head.next=temp;
            }
            head=temp;
            size++;
        }

        void insertAtIdx(int idx, int data){          //Insert At Index
            if(idx>size){
                System.out.println("Invaild index!!!");
                return;
            }
            if(idx==0){
                insertAtFirst(data);
                return;
            }
            if(idx>=size-1){
                insertAtEnd(data);
                return;
            }
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            System.out.println(temp.data);
            Node insertNode=new Node(data);
            insertNode.next=temp.next;
            temp.next=insertNode;
            size++;
            return;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.next+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
            return;
        }



        Node nthNodeFromEndIdx(int fromEndidx){
            int idx=size-fromEndidx;
            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp;

        }



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linklist ll=new linklist();

        System.out.print("Enter the size of link list: ");
        int size=sc.nextInt();

        System.out.print("Enter the Element of link list: ");
        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            ll.insertAtEnd(data);
        }
        ll.display();
        System.out.println(ll.nthNodeFromEndIdx(3).data);

    }
}
