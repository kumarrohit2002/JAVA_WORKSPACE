package StringBuilderClass;
import java.util.*;
public class predefindFunction {
    StringBuilder s=new StringBuilder("hello");
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("hello");
        System.out.println(s);
        s.setCharAt(0,'m');               ///  setCharAt()
        System.out.println(s);

        s.append(" ");                             /// append()
        s.append("Rohit");
        System.out.println(s);

        s.insert(2,'y');                   // insert()
        System.out.println(s);

        s.deleteCharAt(2);                    // deleteCharAt()
        System.out.println(s);

        s.reverse();                                // reverse()
        System.out.println(s);
        s.reverse();

        s.delete(0,6);
        System.out.println(s);






    }
}
