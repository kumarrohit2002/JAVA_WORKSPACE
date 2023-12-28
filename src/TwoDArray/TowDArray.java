package TwoDArray;
import java.util.Scanner;

class multiArray{
    void arr(){
        int[][] arr=new int[2][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

public class TowDArray {
    public static void main(String[] args) {
        multiArray obj = new multiArray();
        obj.arr();
    }
}
