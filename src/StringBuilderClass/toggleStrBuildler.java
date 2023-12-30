package StringBuilderClass;
import java.util.*;
public class toggleStrBuildler {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder s=new StringBuilder(sc.nextLine());  // toggle means -> Rohit Kumar rOHIT kUMAR
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' ') continue;
            if(ch<90){
                s.setCharAt(i,(char)(ch+32));
            }
            else{
                s.setCharAt(i,(char)(ch-32));
            }
        }
        System.out.println(s);
    }
}
