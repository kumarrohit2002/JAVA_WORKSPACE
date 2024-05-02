package FileHandling;

import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class FileReaderInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println("Error: cannot divide by zero");
        }
    }

}
