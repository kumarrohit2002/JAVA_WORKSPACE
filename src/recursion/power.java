package recursion;
import java.util.Scanner;
public class power {

    static int pow(int p,int q){
//        if(q==1) return p;         // normol way
//        return p*pow(p,--q);

        if(q==0) return 1;
        if(q%2==0){
            int result=pow(p,q/2);
            return result*result;          // this is the best way
        }
        else{
            int result=pow(p,(q-1)/2);
            return p*result*result;
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int p=sc.nextInt();
        System.out.print("Enter the power value: ");
        int q=sc.nextInt();
        System.out.println(p+"^"+q+" = "+pow(p,q));
    }
}
