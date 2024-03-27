package Opps.Date_Time;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;

public class totalMondays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter start Date: ");
        String inputdate1=sc.next();
        System.out.print("Enter end Date: ");
        String inputdate2=sc.next();

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate d1=LocalDate.parse(inputdate1,f);
        LocalDate d2=LocalDate.parse(inputdate2,f);

        int m=0;
        while(!d1.isAfter(d2)){
            if(d1.getDayOfWeek()==DayOfWeek.MONDAY){
                m++;
            }
            d1=d1.plusDays(1);
        }
        System.out.println("total no of monday in between years is: "+m);
        sc.close();

    }
}
