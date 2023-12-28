package Arrays;
import java.util.Scanner;
public class greatestNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int smax=max;
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }else if(arr[i]>smax && arr[i]<max){    // for this type of array 8 4 7 2 10 7 9 10 6
                smax=arr[i];
            }
        }
        System.out.println("Max number of array is "+smax);
    }
}


// 1 2 3 4 5 6
// 5 2 6 2 7 8