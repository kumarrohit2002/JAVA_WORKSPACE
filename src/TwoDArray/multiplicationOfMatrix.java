package TwoDArray;
import java.util.Scanner;
public class multiplicationOfMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the matrix row and column size: ");
        int size=sc.nextInt();
        int[][] arr=new int [size][size];
        System.out.print("Enter the element of 1st Matrix: ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the element of 2nd Matrix: ");
        int[][] brr=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        int[][] res=new int[size][size];
        res[0][0]=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                for(int k=0;k<size;k++){
                    res[i][j]+=arr[i][k]*brr[k][j];
                }
            }
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
