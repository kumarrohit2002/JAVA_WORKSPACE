package TwoDArray;
import java.util.*;
public class sumOfEleementOfRow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[] sum=new int[r];
        for(int i=0;i<r;i++){
            sum[i]=0;
            for(int j=0;j<c;j++){
                sum[i]+=arr[i][j];
            }
        }
        for(int i=0;i<r;i++){
            System.out.println(sum[i]);
        }
    }
}
