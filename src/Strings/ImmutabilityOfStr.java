package Strings;

public class ImmutabilityOfStr {
    public static void main(String[] args) {
        String s="hello";
        System.out.println(s);
//        s.charAt(0)='d';    //this is worng because string is immutable
        s="dello";
        System.out.println(s);
        s=s.substring(0,2)+'y'+s.substring(3);
        System.out.println(s);

    }
}
