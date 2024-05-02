package Opps.Inheritance;

class box{
    int height;
    int width;
    box(int height,int width){
        System.out.println("box constructor called");
        this.height=height;
        this.width=width;
    }

}

class boxWeight extends box{
    int weight;
    boxWeight(int height,int width,int weight){
        super(height,width);
        System.out.println("boxWeight constructor called");
        this.weight=weight;
    }

}

class boxPrice extends boxWeight{
    int price;
    boxPrice(int height,int width,int weight,int price){
        super(height,width,weight);
        System.out.println("boxPrice constructor called");
        this.price=price;
    }
}


public class multilevel_Inheritance {
    public static void main(String[] args) {
        boxPrice b=new boxPrice(10,20,30,40);
        System.out.println(b.height+" "+b.width+" "+b.weight+" "+b.price);
    }
}
