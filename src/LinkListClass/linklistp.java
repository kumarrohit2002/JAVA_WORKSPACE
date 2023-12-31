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
        ll.display();
        System.out.println("LinkList size is "+ll.size());
    }
}
