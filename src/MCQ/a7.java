package MCQ;

public class a7 {
    public static void main(String[] args) {
        Integer x=400;
        Integer y=x;
        x++;
        StringBuilder sb1=new StringBuilder("123");
        StringBuilder sb2=sb1;
        sb1.append("5");
        System.out.println(sb1+" "+sb2);
        System.out.println((x==y)+" "+(sb1==sb2));
    }
}


// output -> 1235 1235
//           false true
//