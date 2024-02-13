package TwoDArray;

import java.util.Scanner;

public class matrixMultiplication {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the matrix1 row  size: ");
        int r1=sc.nextInt();
        System.out.print("Enter the matrix1 coloumn  size: ");
        int c1=sc.nextInt();
        int[][] mtx1=new int [r1][c1];
        System.out.println("Enter the element of 1st Matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                mtx1[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter the matrix2 row  size: ");
        int r2=sc.nextInt();
        System.out.print("Enter the matrix2 coloumn  size: ");
        int c2=sc.nextInt();
        int[][] mtx2=new int [r2][c2];
        System.out.println("Enter the element of 2st Matrix: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                mtx2[i][j]=sc.nextInt();
            }
        }

        if(c1==r2){
            int[][] res=new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<r2;k++){
                        res[i][j]+=mtx1[i][k]*mtx2[k][j];
                    }
                }
            }

            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println(" sorry not posible to multiply");
        }

    }
}
