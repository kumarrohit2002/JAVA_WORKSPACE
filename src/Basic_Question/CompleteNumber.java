package Basic_Question;
import java.util.*;
public class CompleteNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int newN=0;
        for(int i=1;i<n;i++){
            if(n%i==0) newN+=i;
        }
        if(n==newN){
            System.out.println(n+" is complete number");
        }else{
            System.out.println(n+" is not complete number");
        }

    }
}

//complete Number 6 =3+2+1(sum of factor)