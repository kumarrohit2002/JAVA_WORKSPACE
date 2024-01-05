package Stacks;
import java.util.Scanner;

public class StackImplimentionUsingLinkedList {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class Stack{
        Node head=null;
        int size=0;
        void push(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }else{
                temp.next=head;
                head=temp;
            }
            size++;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack UnderFlow!!");
                return -1;
            }
            int top=head.data;
            head=head.next;
            size--;
            return top;
        }

//        void display(){
//            Node temp=head;
//            while(temp!=null){
//                System.out.print(temp.data+" ");
//                temp=temp.next;
//            }
//            System.out.println();
//        }
        void displayr(Node temp){
            if(temp==null){
                return;
            }
//            System.out.print(temp.data+" ");
            displayr(temp.next);
            System.out.print(temp.data+" ");
        }

        void display(){
            displayr(head);
            System.out.println();
            return;
        }

        boolean isempty(){
            return size==0?true:false;
        }

        int peek(){
            if(size==0){
                System.out.println("Stack is Empty");
            }
            return head.data;
        }
        int size(){
            return size;
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack st=new Stack();
        for(int i=0;i<6;i++){
            int data=sc.nextInt();
            st.push(data);
        }
        st.display();
        System.out.println("Size of stack is: "+st.size());
        st.pop();
        System.out.println(st.pop());
        st.display();
        System.out.println(st.peek());
    }
}
