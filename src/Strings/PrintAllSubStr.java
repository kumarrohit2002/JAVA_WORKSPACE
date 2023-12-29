package Strings;
import java.util.*;
public class PrintAllSubStr {
    static void allsubstr(){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length()+1;j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }

    public static void main(String[] args) {
        allsubstr();
    }
}
