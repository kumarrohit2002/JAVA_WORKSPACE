package StringBuilderClass;
import java.util.Scanner;
public class decleration {
    public static void main(String[] args) {

        // StringBuilder  decleretion
        StringBuilder s=new StringBuilder("hello ");
        System.out.println(s);

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first name: ");
        StringBuilder str=new StringBuilder(sc.next());
        System.out.print("Enter your tital: ");
        StringBuilder gtr=new StringBuilder(sc.next());
        str.append(" ");
        str.append(gtr);
        System.out.println("your full name is "+str);
    }
}
