package Stacks;

import java.util.Stack;

public class BlanceBracket {

    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        String s=" ( )( ( ) )";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') continue;
            if(s.charAt(i)=='(') st.push(s.charAt(i));
            if(s.charAt(i)==')') st.pop();
        }
        if(st.empty()){
            System.out.println("String is Balanced Bracket!!");
        }else{
            System.out.println("String is not Balanced Bracket!!");
        }
    }
}
