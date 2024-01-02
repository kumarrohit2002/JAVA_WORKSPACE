package LinkListClass;
import java.util.Scanner;

public class singhlyLL {
    public static class Node{                        // Node Class
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }
    public static class linklist{                   //link list Class
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int data){                //insert At End
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }

        void insertAtFirst(int data){               //Insert At First
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }else{
                temp.next=head;
            }
            head=temp;
            size++;
        }

        void insertAtIdx(int idx, int data){          //Insert At Index
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

        int getAtIdx(int idx){                     // Get At Index element
            if(idx>size-1) return -1;
            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void deleteAtIdx(int idx){                   //Delete At Index
            if(idx>size-1){
                System.out.println("Invalid index!!!");
                return;
            }
                if(idx==0){
                    head=head.next;
                    size--;
                    return;
                }
                Node temp=head;
                for(int i=0;i<idx-1;i++){
                    temp=temp.next;
                }

                temp.next=temp.next.next;
        }

        void display(){                                  // Display
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
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
        ll.insertAtEnd(50);
        ll.insertAtFirst(100);
        ll.display();
        ll.insertAtIdx(7,200);
        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.getAtIdx(7));
        ll.display();
        ll.deleteAtIdx(7);
        ll.display();

    }
}
