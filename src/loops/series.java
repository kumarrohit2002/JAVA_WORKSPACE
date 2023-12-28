package loops;
import java.util.Scanner;
public class series {
//    Function..............
    static void fun(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum-=i;
            }else{
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fun(n);
    }
}


// 1 - 2 + 3 - 4 + 5 - .......... n = ?