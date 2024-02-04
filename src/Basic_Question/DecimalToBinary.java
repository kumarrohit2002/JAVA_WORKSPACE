package Basic_Question;
import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int binary=0;
        while(n!=0){
            binary=binary+(n%2);
            binary*=10;
            n/=2;
        }
        System.out.println(binary);
    }
}
