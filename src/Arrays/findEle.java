package Arrays;
import java.util.Scanner;
public class findEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter your target!!");
        int target;
        target=sc.nextInt();
        boolean f=true;
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                f=false;
                break;
            }
        }
        if(f){
            System.out.println("target is found!");
        }else{
            System.out.println("target is not found!");
        }

    }
}