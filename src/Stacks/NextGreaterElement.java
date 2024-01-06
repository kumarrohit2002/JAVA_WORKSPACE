package Stacks;

import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr={1,5,3,2,1,6,3,4};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(arr[n-1]);
        res[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            while (!st.isEmpty() && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }


    }
}


// 1 5 3 2 1 6 3 4
// 5 6 6 6 6 -1 4 -1package Stacks;
