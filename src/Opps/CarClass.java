package Opps;

public class CarClass {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.name="bmw";
        c1.price=1000000000;
        c1.setModal(2024);
        c1.engin_no="AC2B252";

        System.out.println(c1.name);
        System.out.println(c1.price);
        System.out.println(c1.getModal());
        System.out.println(c1.engin_no);

    }
}
