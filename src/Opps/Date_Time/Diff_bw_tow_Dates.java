package Opps.Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Diff_bw_tow_Dates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Date1 (dd-MM-yyyy): ");
        String inputDate1=sc.next();
        System.out.print("Enter Date2 (dd-MM-yyyy): ");
        String inputDate2=sc.next();

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date1=LocalDate.parse(inputDate1,f);
        System.out.println(date1);
        LocalDate date2=LocalDate.parse(inputDate2,f);
        System.out.println(date2);

        long years= ChronoUnit.YEARS.between(date1,date2);
        long days= ChronoUnit.DAYS.between(date1,date2);
        long months= ChronoUnit.MONTHS.between(date1,date2);
        long Weeks= ChronoUnit.WEEKS.between(date1,date2);




        System.out.println("Total Years: "+years);
        System.out.println("Total Days: "+days);
        System.out.println("Total Months: "+months);
        System.out.println("Total Weeks: "+Weeks);


    }
}
