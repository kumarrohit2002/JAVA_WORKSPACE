package Stacks;

import java.util.Stack;
import java.util.*;

public class CopyStackOneToAnother {
    public static void copyStack(Stack<Integer> st,Stack<Integer> cp){
        if(st.empty()) return;
        int cpEle=st.peek();
        st.pop();
        copyStack(st,cp);
        cp.push(cpEle);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            st.push(data);
        }
        System.out.println(st);
        Stack<Integer> cp=new Stack<>();
        copyStack(st,cp);
        System.out.println(cp);

    }
}
