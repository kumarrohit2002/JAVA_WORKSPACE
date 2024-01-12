package Stacks;

import java.util.Stack;

public class infix {
    public static void main(String[] args) {
        String s="2+4-3*4/6";
        Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii <=57){
                val.push(ascii- '0');
            }
            else if(op.size()==0) op.push(ch);
            else{
                if(ch=='+' || ch=='-'){
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' ||op.peek()=='/'){
                        int v2=val.pop();
                        int v1=val.pop();
                        if(op.peek()=='*') val.push(v1*v2);
                        if(op.peek()=='/') val.push(v1/v2);
                        op.pop();
                        op.push(ch);
                    }else op.push(ch);
                }
            }
        }
        // val.size > 1
        while(val.size()>1){
            int v2=val.pop();
            int v1=val.pop();
            if(op.peek()=='+') val.push(v1+v2);
            if(op.peek()=='-') val.push(v1-v2);
            if(op.peek()=='*') val.push(v1*v2);
            if(op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
