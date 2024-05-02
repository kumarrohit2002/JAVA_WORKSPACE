package Opps.Date_Time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class diff_bt_time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time  1 in format(HH:mm)");
        String inputtime1=sc.next();
        System.out.println("Enter time  1 in format(HH:mm)");
        String inputtime2=sc.next();

        DateTimeFormatter f=DateTimeFormatter.ofPattern("HH:mm");
        LocalTime t1=LocalTime.parse(inputtime1,f);
        LocalTime t2=LocalTime.parse(inputtime2,f);

        long h= ChronoUnit.HOURS.between(t1,t2);
        long m=ChronoUnit.MINUTES.between(t1,t2);
        System.out.println(h+" hours "+(m/60)+" minutes");


    }
}
