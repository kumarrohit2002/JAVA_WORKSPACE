package Opps.Inheritance.Boxes;

public class Main {
    public static void main(String[] args) {
//        parent class  .........................
        Box box=new Box();
        Box box1=new Box(4,5,6);
        Box box2=new Box(box1);
        System.out.println(box1.length+"   "+box1.width+"  "+box1.height);
        System.out.println(box2.length+"   "+box2.width+"  "+box1.height);
        System.out.println(box2);
//          child class  ......................
        BoxWeight boxweight=new BoxWeight(4,5,6,7);
        System.out.println(boxweight.length+"   "+boxweight.width+"  "+boxweight.height+"  "+boxweight.weight);

        Box box3=new BoxWeight(2,3,4,5);
        System.out.println(box3.length+"  "+box3.width+" ");
//        System.out.println(box3.weight);           // can not Access  box3.weight because box3 is Box object

        //there are many variable in both parent and child classes
        //you are given access  to variable that are in the ref type of i.e BoxWeight
        //hence ,you should  have to access to weight variable
        // this also means,that the   ones that you are trying to access should be initilised
        // but here ,when the object itself is of type parents, class will you call the constructor
        // that is why error

//        BoxWeight box4=new Box(2,3,5);

        BoxWeight box5=new BoxWeight(boxweight);
        System.out.println(box5.length+"  "+box5.weight);




    }
}
