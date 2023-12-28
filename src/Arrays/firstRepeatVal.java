package Arrays;
import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;
public class firstRepeatVal {
    //function or method
    static int firstRepeatingNumber(int[] arr){
        int size=arr.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j] && i!=j){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    //main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Enter the size of array: ");
        size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int rep=firstRepeatingNumber(arr);
        System.out.println(rep);
    }
}
