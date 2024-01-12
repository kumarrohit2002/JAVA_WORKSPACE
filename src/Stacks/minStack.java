package Stacks;

import java.util.Stack;
import java.util.Scanner;

public class minStack {
    public static class minstack{
        Stack<Integer> st=new Stack<>();
        int min=0;
        void push(int data){
            if(st.size()==0){
                st.push(data);
                min=data;
                return;
            }
            if( data >= min){
                st.push(data);
                return;
            }
            if(data<min){
                st.push(2*data-min);
                min=data;
                return;
            }
            return;
        }

        void pop(){
//            System.out.println(min);
            if(st.size()==0) return;
            else if(st.peek() >= min){
                st.pop();
                return;
            }
            if(st.peek()<min){
                int oldv=2*min-st.peek();
                min=oldv;
                st.pop();
                return;
            }
        }

        int top(){
            if(st.size()==0) return -1;
            if(st.peek()>=min) return st.peek();
            if(st.peek()<min) return min;
            return -1;
        }
        int size(){
            return st.size();
        }
        int getMin(){
            return min;
        }

    }

    public static void main(String[] args) {
        minstack mst=new minstack();
        Scanner sc=new Scanner(System.in);
        int[] arr={7,8,5,6,3,4};
        for(int i=0;i<arr.length;i++){
            mst.push(arr[i]);
        }
        mst.pop();
        System.out.println(mst.top());
        System.out.println(mst.getMin());
        mst.pop();
        System.out.println(mst.top());
        System.out.println(mst.getMin());


    }
}
