package Opps.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human rohit=new Human(12,"Rohit",500000,false);
        Human mohit=new Human(22,"mohit",500400,false);
        System.out.println(rohit.population);
        System.out.println(mohit.population);

        fun();
//        fun2();  // cannot call function because not have object
        Main obj=new Main();
        obj.fun2();
    }

    static  void fun(){
//        greating();  cannot call because not have object......
        Main obj=new Main();
        obj.greating();
    }
    void fun2(){
        greating();
    }

    void greating(){
        System.out.println("Hello world");
    }

}
