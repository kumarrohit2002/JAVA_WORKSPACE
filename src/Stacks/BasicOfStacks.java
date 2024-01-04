package Stacks;

import java.util.Stack;

public class BasicOfStacks {
    public static void rdisplay(Stack<Integer> st){
        if(st.empty()) return;
        System.out.print(st.peek()+" ");
        st.pop();
        rdisplay(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println("Size of Stack is : "+st.size());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        System.out.println("Size of Stack is : "+st.size());
        rdisplay(st);
    }
}
