package Opps.Inheritance.Boxes;

public class Box {
    int length;
    int width;
    int height;
    int weight;
    Box(){
        this.length=-1;
        this.width=-1;
        this.height=-1;
    }
    // copy constroctor...........................
    Box(Box other){
        super();
        this.length=other.length;
        this.width=other.width;
        this.height=other.height;
    }

    Box(int l,int w,int h){
        System.out.println("Box class constructor");
        this.length=l;
        this.width=w;
        this.height=h;
    }
    public void information(){
        System.out.println("Box is Running");
    }


}
