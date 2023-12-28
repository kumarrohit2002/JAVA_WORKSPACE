package TwoDArray;
import java.util.Scanner;
public class transposeOfMatrix {
    static void tranpose(){
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.print("Enter the no of row of matrix: ");
        r=sc.nextInt();
        System.out.print("Enter the no of column of matrix: ");
        c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("transpose of matrix is : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println("");
        }
        return;
    }

    public static void main(String[] args) {
        tranpose();
    }
}
