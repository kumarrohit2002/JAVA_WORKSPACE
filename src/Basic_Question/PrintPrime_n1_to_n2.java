package Basic_Question;
import java.util.*;
public class PrintPrime_n1_to_n2 {
    public static boolean isPrime(int n,int i){
        if (n <= 2) return (n == 2) ? true : false;
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    public static void printFact(int n){
        if(isPrime(n,2)){
            System.out.print(n+" ");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<n2;i++){
            printFact(i);
        }
    }
}
