package Arrays;
import java.util.Scanner;
public class prefixsum {

    static void prefixSum(int arr[]){
        int size=arr.length;
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        prefixSum(arr);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
