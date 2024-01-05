package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class RemoveConsecutiveSubsequences {

    public static Stack<Integer> removeConsecutive(int[] arr){
        int size=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<size;i++){
            if(st.size()==0 || st.peek()!=arr[i] ) {
                st.push(arr[i]);
            }
            else {
                if(i==size-1 || arr[i]!=arr[i+1]) st.pop();
            }
        }
//        System.out.println(st);
        return st;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer> st=removeConsecutive(arr);
        System.out.println(st);

    }
}
