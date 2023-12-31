package OppsTesting;
// here import -> package  Opps.Student;
import Opps.Student;

public class studentClassTesting {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="rahul";
        s1.rno=33;
        s1.marks=66;

        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.marks);

    }
}
