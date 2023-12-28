package Arrays;

import java.util.Scanner;

public class targetSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter your target sum value: ");
        int target;
        target=sc.nextInt();
        int c=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]==target){
                    c++;
                }
            }
        }
        System.out.println("no of pair is "+c);

    }
}

//6 4 3 5 8 2
