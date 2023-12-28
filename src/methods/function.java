package methods;
class sum{
    int add(int a,int b){
        return a+b;
    }
}

public class function {
    public static void main(String[] args) {
        sum obj=new sum();
        System.out.println(obj.add(10,20));
    }
}
