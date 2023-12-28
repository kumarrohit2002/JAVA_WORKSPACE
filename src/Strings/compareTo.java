package Strings;
import java.util.*;
public class compareTo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="rohit";
        String gtr="mohit";
        String atr="rohit";
        System.out.println(str.compareTo(gtr));
        System.out.println(gtr.compareTo(str));
        System.out.println(atr.compareTo(str));
    }
}
