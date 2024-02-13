package Basic_Question;
import  java.util.*;
public class factorial {
    public static int fact(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        int n=Integer.parseInt(args[0]);
        System.out.println("factorial of "+n+" is "+fact(n));
    }
}
