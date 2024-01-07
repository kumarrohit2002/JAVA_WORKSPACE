package Stacks;

import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] res=new int[n];
        res[0]=1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(arr[st.peek()]<arr[i]){    //important Q
                st.pop();
            }
            res[i]=i-st.peek();
            st.push(i);
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
