package Stacks;

import java.util.Stack;

public class Largest_Area_Histogram {

    public static void main(String[] args) {
        int[] height={2,1,5,6,2,3};
        int n=height.length;
        int[] nse=new int[n];
        int[] pse=new int[n];
        Stack<Integer> st=new Stack<>();
        // calculate next smaller element(nse)
        st.push(n-1);
        nse[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && height[st.peek()]>=height[i]){
                st.pop();
            }
            if(st.size()==0) nse[i]=n;  //store arr size
            else nse[i]=st.peek();
            st.push(i);
        }

        // for empty stack
        while(st.size()>0) st.pop();
        // calculate previous smaller element
        pse[0]=-1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && height[st.peek()]>=height[i]){
                st.pop();
            }
            if(st.size()==0) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        //maximum area of rectangle
        int max=-1;
        for(int i=0;i<n;i++){
            int area=height[i]*(nse[i]-pse[i]-1);
            max=Math.max(max,area);
        }
        System.out.println(max);

    }
}
