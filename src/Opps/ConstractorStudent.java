package Opps;

public class ConstractorStudent {
    public String name;
    public int rno;
    public double percentage;
    final String SchoolName="umhs juaphar";    //  final  keyword -> can't change value ...

    public ConstractorStudent(){}    ///  default constractor........
    public ConstractorStudent(String name,int rno,double percentage){    ///  parametrise Constroctor........
        this.name=name;
        this.rno=rno;
        this.percentage=percentage;
    }
}
