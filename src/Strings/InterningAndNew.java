package Strings;


// Interning -> for save the space
// new ->


public class InterningAndNew {
    public static void main(String[] args) {
        String str=" hello";
        String gtr="hello";
        System.out.println(str);
        System.out.println(gtr);
        String s=new String("hello");
        System.out.println(s);
    }
}
