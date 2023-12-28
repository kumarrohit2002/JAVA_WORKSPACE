package ifelse;
import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age;
        age=sc.nextInt();
        if(age>18){
            System.out.println("your are eligible for vote!!!");
        }else{
            System.out.println("you are not eligible for vote!!!");
        }
    }
}
