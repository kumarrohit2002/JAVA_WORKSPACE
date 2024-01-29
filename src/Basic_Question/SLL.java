package Basic_Question;

public class SLL {

    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
        }
    }

    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtHead(int d){
            Node temp=new Node(d);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
            size++;
            return;
        }

        void insertAtTail(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
            size++;
            return;
        }

        void insertAtInx(int idx,int data){
            if(idx==0){
                insertAtHead(data);
                return;
            }
            else if(idx>=size-1){
                insertAtTail(data);
                return;
            }else{
                Node temp=head;
                for(int i=1;i<idx;i++){
                    temp=temp.next;
                }
                Node insertNode=new Node(data);
                insertNode.next=temp.next;
                temp.next=insertNode;
                size++;
            }
            return;
        }
        void display(){
            Node temp=head;
            for(int i=0;i<size;i++){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtHead(10);
        ll.insertAtHead(20);
        ll.insertAtHead(30);
        ll.insertAtHead(40);
        ll.insertAtHead(50);
        ll.insertAtInx(7,100);
        ll.display();
    }
}
