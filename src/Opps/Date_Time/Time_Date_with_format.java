package Opps.Date_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time_Date_with_format {
    public static void main(String[] args) {
        LocalDateTime obj=LocalDateTime.now();
        System.out.println(obj);
        DateTimeFormatter fobj=DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:s");
        String s=obj.format(fobj);
        System.out.println(s);
    }
}
