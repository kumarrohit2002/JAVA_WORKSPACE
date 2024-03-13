package Decimalvalue;

import java.math.BigDecimal;
import java.math.MathContext;

public class BD {
    public static void main(String[] args) {
        double d=23.4586;
        MathContext m=new MathContext(4);
        BigDecimal bd=new BigDecimal(d,m);
        System.out.println(bd);
    }
}
