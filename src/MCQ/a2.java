package MCQ;

public class a2 {
    public static void main(String[] args) {
        String test="a1b2c3";
        String[] tokens=test.split("\\d");
        for(String s:tokens){
            System.out.print(s);
        }
    }
}

// output -> abc