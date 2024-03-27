package Opps.Date_Time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TotalSunday {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String inputdate1=sc.next();
        String inputdate2=sc.next();

        DateTimeFormatter f= DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate d1=LocalDate.parse(inputdate1,f);
        LocalDate d2=LocalDate.parse(inputdate2,f);

        int c=0;
        while (!d1.isAfter(d2)){
            if(d1.getDayOfWeek()== DayOfWeek.SUNDAY) c++;
            d1=d1.plusDays(1);
        }
        System.out.println(c);

    }
}
