package Opps.Inheritance.Boxes;

public class BoxWeight  extends  Box{
    int weight;
    BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(int l,int w,int h,int weight){
        super(l,w,h); // call the parent class constructor
        System.out.println(super.weight);
        this.weight=weight;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight=other.weight;
    }

}
