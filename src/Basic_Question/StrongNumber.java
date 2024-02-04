package Basic_Question;
import java.util.*;

public class StrongNumber {
    public static int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nn=n;
        int sn=0;
        while(n!=0){
            sn+=fact(n%10);
            n/=10;
        }
        System.out.println(sn);
        if(sn==nn){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong number");
        }

    }
}


// Strong -> 145 = 1!+4!+5!