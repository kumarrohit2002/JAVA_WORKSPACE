package recursion;

import java.util.Scanner;

public class TOH {
    static void toh(int n,char a,char c,char b){
        if(n==0) return;
        toh(n-1,a,b,c);
        System.out.println("move disk "+n+"from "+a+" to "+c);
        toh(n-1,b,c,a);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        toh(n,'A','C','B');
    }
}