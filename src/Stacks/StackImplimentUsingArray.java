package Stacks;
import java.util.Scanner;
public class StackImplimentUsingArray {
    public static class Stack{
        private int[] arr=new int[5];
        private int idx=0;
        void push(int data){
            if(isfull()){
                System.out.println("Stack OverFlow!!!");
                return;
            }
            arr[idx]=data;
            idx++;
        }

        int pop(){
            if(idx==0){
                System.out.println("Stack underflow!!!");
                return -1;
            }
            idx--;
            return arr[idx];
        }

        int peek(){
           return idx>0?arr[idx-1]:-1;
        }
        int size(){
            return idx;
        }

        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        boolean isempty(){
            return idx==0? true:false;
        }

        boolean isfull(){
            return idx==arr.length ? true:false;
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
