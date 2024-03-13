package Opps.destructors;

public class destructor {
    public static void main(String[] args) {
        A obj=new A(10);
        for(int i=0;i<1000000;i++){
            obj=new A(10);
        }

    }
}

class A{
    int a;
    A(int a){
//        System.out.println("constructor called");
        this.a=a;
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
