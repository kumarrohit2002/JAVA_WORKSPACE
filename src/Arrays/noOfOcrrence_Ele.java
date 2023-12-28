package Arrays;
import java.util.Scanner;
public class noOfOcrrence_Ele {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size;
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter the element of array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the paticular element: ");
        int ele;
        ele=sc.nextInt();
        int c=0;
        for(int i=0;i<size;i++){
            if(arr[i]==ele){
                c++;
            }
        }
        System.out.println(ele+"  Orenccr "+c+" times in array");
    }
}
