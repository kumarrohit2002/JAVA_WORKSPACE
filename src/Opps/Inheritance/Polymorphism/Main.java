package Opps.Inheritance.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes circle=new Circle();
        Shapes triangle=new Trangle();
        Shapes square=new Square();
        Shapes shape=new Shapes();

        square.area();
    }
}
