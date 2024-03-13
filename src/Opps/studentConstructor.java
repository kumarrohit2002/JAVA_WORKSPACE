package Opps;

public class studentConstructor {
    public static void main(String[] args) {
        Stud rohit = new Stud();
        Stud mohit = new Stud(34, "mohit kumar", 56.6);
        System.out.println(rohit.name);
        System.out.println(mohit.name);
        Stud one = new Stud(mohit);
        System.out.println(one.name);


        Stud two=one;
        one.name="Something something";

        System.out.println(one.name);
        System.out.println(two.name);

    }
}

class Stud {
    int rno;
    String name;
    double marks;

    // Default Constructor
    Stud() {
        this(100, "Rohit Kushwaha", 89.5);
    }

    // Copy constructor
    Stud(Stud other) {
        this.rno = other.rno;
        this.name = other.name; // missing initialization
        this.marks = other.marks;
    }

    // Parameterized constructor
    Stud(int rno, String name, double marks) {
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }
}
