package Arrays;
import java.util.Scanner;
public class divideTwopartArray {
    static boolean checkTwopartOrnot(int arr[]){
        int size=arr.length;
        boolean f=true;
        for(int i=1;i<size;i++){
            arr[i]+=arr[i-1];
        }
        int sum=arr[size-1];
        for(int i=0;i<size-2;i++){
            if(arr[i]==arr[i]-sum){
                f=false;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array is divide two part: true or false: -> "+checkTwopartOrnot(arr));
    }
}
