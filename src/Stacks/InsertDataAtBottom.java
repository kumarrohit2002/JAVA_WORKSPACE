package Stacks;
import java.util.*;
public class InsertDataAtBottom {
    public static void insertAtBottom(Stack<Integer> st,int data){
        if(st.empty()) {
            st.push(data);
            return;
        }
        int ele=st.peek();
        st.pop();
        insertAtBottom(st,data);
        st.push(ele);

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
        insertAtBottom(st,500);
        System.out.println(st);

    }
}
