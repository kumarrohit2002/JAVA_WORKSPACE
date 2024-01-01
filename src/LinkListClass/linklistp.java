package LinkListClass;

public class linklistp {
    public static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }

    public static class linklist{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
        }
        void insertAtFirst(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }else{
                temp.next=head;
            }
            head=temp;
        }
        void insertAtAnyIdx(int position,int data){
            if (position < 1 || position > size() + 1) {
                System.out.println("Invalid position. Cannot insert at position " + position);
                return;
            }
            if(position==1){
                insertAtFirst(data);
                return;
            }
            Node temp=head;
            int idx=1;
            while(idx<position-1){
                temp=temp.next;
                idx++;
            }
            if(temp.next==null){
                insertAtEnd(data);
                return;
            }
            Node insertNode=new Node(data);
            insertNode.next=temp.next;
            temp.next=insertNode;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println("\n");
        }
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

    }
    public static void main(String[] args) {
        linklist ll=new linklist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(7);
        ll.insertAtEnd(9);
        ll.insertAtFirst(100);
        ll.display();
        System.out.println("LinkList size is "+ll.size());
        System.out.println("head -> data = "+ll.head.data);
        System.out.println("tail -> data = "+ll.tail.data);
        ll.insertAtAnyIdx(1,55);
        ll.display();
        ll.insertAtAnyIdx(2,500);
        ll.display();
        ll.insertAtAnyIdx(8,500);
        ll.display();
        System.out.println("head -> data = "+ll.head.data);
        System.out.println("tail -> data = "+ll.tail.data);
    }
}
