package Opps;
class SBI {
    private int a;
    SBI() {
        System.out.println("Bank");
    }
    void check(){
        System.out.println(a);
    }
}
class hdfc extends SBI{
    private int a;
    hdfc(int a){
        this.a=a;
    }
    void check(){
        System.out.println(a);
    }
}

public class bank {
    public static void main(String[] args) {
//        SBI obj1 = new SBI();
        hdfc obj2=new hdfc(5);
        obj2.check();

    }
}

