package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class PopfromAnyIndex {
    public static void popBottom(Stack<Integer> st,int idx,int size){
        if(idx==size){
            st.pop();
            return;
        }
        int top=st.pop();
        popBottom(st,idx,size-1);
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            st.push(data);
        }
        System.out.println(st);
        popBottom(st,2,st.size());
        System.out.println(st);
    }
}
