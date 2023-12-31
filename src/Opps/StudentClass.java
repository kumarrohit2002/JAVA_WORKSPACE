package Opps;

public class StudentClass {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="rohit";
        s1.rno=30;
        s1.marks=90.0;
        System.out.println(s1.name);
        s1.name="mohit";
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.marks);
    }
}
