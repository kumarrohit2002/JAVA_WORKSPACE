package Basic_Question;

import java.util.Stack;

public class bilanceBracket {
    public static void main(String[] args) {
        String s="(())(";
        Stack<Character> st=new Stack<>();
        int i=0;
        while (i<s.length() ){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{
                st.pop();
            }
            i++;
        }
        if(st.isEmpty()){
            System.out.println("balance bracket!!");
        }else{
            System.out.println("not balance bracket!!");
        }

    }
}
