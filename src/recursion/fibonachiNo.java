package recursion;
import java.util.Scanner;
public class fibonachiNo {

    static int fibo(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
