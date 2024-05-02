package Opps.Date_Time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

    public class ca2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Enter the start date in the format yyyy-MM-dd:");
            String startDateStr = scanner.nextLine();
            LocalDate startDate = LocalDate.parse(startDateStr, DateTimeFormatter.ISO_DATE);


            System.out.println("Enter the current date in the format yyyy-MM-dd:");
            String currentDateStr = scanner.nextLine();
            LocalDate currentDate = LocalDate.parse(currentDateStr, DateTimeFormatter.ISO_DATE);
            
            long weeksElapsed = calculateWeeksElapsed(startDate, currentDate);
            System.out.println("Weeks elapsed since the start date: " + weeksElapsed);
        }

        public static long calculateWeeksElapsed(LocalDate startDate, LocalDate currentDate) {
            return java.time.temporal.ChronoUnit.WEEKS.between(startDate, currentDate);

        }

}
