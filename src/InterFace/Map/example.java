package InterFace.Map;

import java.util.HashMap;
import java.util.*;


public class example {
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap<String,Integer>();
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.print("Name: ");
            String n=sc.next();
            System.out.print("Roll no: ");
            int rno=sc.nextInt();
            m.put(n,rno);
        }

        System.out.println("Students details Are: ");

        for(Map.Entry<String,Integer> entry:m.entrySet()){
            System.out.println("Name = "+entry.getKey()+" ,Roll No = "+entry.getValue());
        }


    }
}
