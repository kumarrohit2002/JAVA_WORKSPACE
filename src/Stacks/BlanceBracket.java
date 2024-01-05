package Stacks;

import java.util.Stack;

public class BlanceBracket {

    public static boolean ismatch(char open,char close){
        return (open=='(' && close==')') ||
                (open=='{' && close=='}') ||
                (open=='[' && close==']');
    }

    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        String s=" [{( )}( ( () )]";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' ') continue;
            if(ch=='(' || ch=='{' || ch=='[') st.push(s.charAt(i));
//            if(!st.isEmpty() && st.peek()==ch) st.pop();   // this is give worng answer
            if(!st.isEmpty() && ismatch(st.peek(),ch)) st.pop();
        }
        if(st.empty()){
            System.out.println("String is Balanced Bracket!!");
        }else{
            System.out.println("String is not Balanced Bracket!!");
        }
    }
}
