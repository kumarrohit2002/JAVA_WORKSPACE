package Opps;

public class students {
    public static class student1{
        String name;
        int rno;
        float marks;

    }
    public static void main(String[] args) {
        student1  s=new student1();
        s.name="rohit";
        s.rno=34;
        s.marks=96;
//        System.out.println(s.name);
//        System.out.println(s.rno);
//        System.out.println(s.marks);

//        student2 s2=new student2(34,"rohit",96.4f);
        student2 s1=new student2();
        student2 s2=new student2(s1);
        System.out.println(s2.rno);
        System.out.println(s2.name);
        System.out.println(s2.marks);


        student2 one=new student2();
        student2 two=one;
        one.name="Ankita";
        System.out.println(two.name);

    }
}

class student2{
    int rno;
    String name;
    float marks;
    student2(){
        this(34,"rohit",96.4f);
    }
    student2(student2 s){
        this.rno=s.rno;
        this.name=s.name;
        this.marks=s.marks;
    }
    student2(int rno, String name, float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;

    }
}
