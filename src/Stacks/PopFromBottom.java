package Stacks;
import java.util.*;
public class PopFromBottom {
    public static void popBottom(Stack<Integer> st){
        if(st.size()==1){
            st.pop();
            return;
        }
        int top=st.pop();
        popBottom(st);
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
        popBottom(st);
        System.out.println(st);
    }
}
