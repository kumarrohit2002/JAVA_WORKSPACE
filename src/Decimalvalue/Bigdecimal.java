package Decimalvalue;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
//import java.util.*;
public class Bigdecimal {
    public static void main(String[] args) {
        float f = 100.3543f;
        DecimalFormat df = new DecimalFormat("#.##"); // Specify 3 decimal places
        String formattedValue = df.format(f);

        System.out.println(formattedValue); // Output: 10.354
        setscale1();
    }

    public static void setscale1() {
        // Create a BigDecimal with an unscaled value of 12345 and scale of 2
        BigDecimal decimal = new BigDecimal("15.109089");
        // Set the scale to 3 and round using ROUND_HALF_UP
        BigDecimal roundedDecimal = decimal.setScale(3,BigDecimal.ROUND_HALF_UP);
        System.out.println("Original value: " + decimal);
        System.out.println("Rounded value with scale 3: " + roundedDecimal);
//   ----------------------------------------------------------------
        DecimalFormat df=new DecimalFormat("#.####");
        String s=df.format(decimal);
        System.out.println("DecimalFormat: "+s);
//------------------------------------------------------------------
        MathContext m=new MathContext(6);
        BigDecimal b=new BigDecimal("234.6565",m);
        System.out.println("MathContext: "+b);

    }
}
