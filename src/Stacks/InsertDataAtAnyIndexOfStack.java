package Stacks;
import java.util.*;
public class InsertDataAtAnyIndexOfStack {
    public static void insertAtIdx(Stack<Integer> st,int data,int idx,int size){
//        if (idx < 0 || idx > st.size()) {
//            throw new IllegalArgumentException("Invalid index");
//        }
        if(st.size()==idx) {
            st.push(data);
            return;
        }
        int ele=st.peek();
        st.pop();
        insertAtIdx(st,data,idx,size-1);
        st.push(ele);
        return;
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
        insertAtIdx(st,500,3,st.size());
        System.out.println(st);
    }
}
