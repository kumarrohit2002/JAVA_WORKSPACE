package MCQ;

public class a3 {
    int squares=81;
    public static void main(String[] args) {
        new a3().go();
    }

    void go(){
        incr(++squares);
        System.out.println(squares);
    }

    void incr(int squares){
        squares+=10;
    }
}
