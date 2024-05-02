package Basic_Question;
import java.util.Scanner;

public class detail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu\n1. Doctor\n2. Patient\nEnter your choice:");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (choice == 2) {
            System.out.println("Enter patient details (name,email,mobile,address,bloodGroup,height,weight):");
            String[] details = sc.nextLine().split(",");
            if (details.length == 7) {
                System.out.println("Patient details\nName: " + details[0] + "\nEmail: " + details[1] + "\nMobile: " +
                        details[2] + "\nAddress: " + details[3] + "\nBlood Group: " + details[4] + "\nHeight: " + details[5] + "\nWeight: " + details[6]);
            } else {
                System.out.println("Invalid input.");
            }
        } else {
            System.out.println("Invalid input.");
        }

        sc.close();
    }
}
