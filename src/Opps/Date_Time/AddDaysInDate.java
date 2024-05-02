package Opps.Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AddDaysInDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date (dd-MM-yyyy): ");
        String inputDate=sc.nextLine();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate d1=LocalDate.parse(inputDate,f);
        System.out.println("Input date is "+d1);

        System.out.print("Enter add Days no: ");
        long addDays=sc.nextInt();
        LocalDate ad=d1.plusDays(addDays);
        String ad1=f.format(ad);

        System.out.println("Added Date is "+ad1);
        // Close the scanner
        sc.close();

    }
}
