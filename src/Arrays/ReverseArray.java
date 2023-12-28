package Arrays;
import java.util.Scanner;
public class ReverseArray {
    static void reverse(int[] arr){
        int[] brr=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            brr[arr.length-i-1]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=brr[i];
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Enter the size of Array: ");
        size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
//        int[] reverseArr=new int[size];
        reverse(arr);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
