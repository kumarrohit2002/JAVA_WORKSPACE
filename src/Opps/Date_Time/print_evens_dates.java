package Opps.Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class print_evens_dates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter date 1 (dd-MM-yyyy): ");
        String inputdate1=sc.next();
        System.out.print("Enter date 2 (dd-MM-yyyy): ");
        String inputdate2=sc.next();

        DateTimeFormatter f= DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate d1=LocalDate.parse(inputdate1,f);
        LocalDate d2=LocalDate.parse(inputdate2,f);
        System.out.println("Even date in between is: ");
        while(!d1.isAfter(d2)){
            int day=d1.getDayOfMonth();
            if(day%2==0){
                String s=d1.format(f);
                System.out.println(s);
            }
            d1=d1.plusDays(1);
        }
    }
}
