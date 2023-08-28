import java.util.Date;
import java.util.Scanner;

public class TaskScheduling {
    public static void main(String[] args) {
        Date currentDate = new Date();

        System.out.print("Enter the number of days in the future: ");
        int daysInFuture = new Scanner(System.in).nextInt();

        System.out.println("Scheduled task execution Date: " + taskScheduling(currentDate, daysInFuture));
    }

    //method to calculate the date and time of the scheduled task execution
    public static Date taskScheduling(Date currentDate, int days) {
        long scheduleDateMillis = currentDate.getTime() + days * 24L * 60 * 60 * 1000;
        Date scheduledDate = new Date(scheduleDateMillis);

        // System.out.println("Scheduled task execution Date: " + scheduledDate);
        return scheduledDate;
    }
}
/*
4. Task Scheduling:
   Develop a task scheduling application. Create a method that takes a `Date` object representing the current date and time, and an integer representing the number of days in the future. Determine and display the date and time that corresponds to the scheduled task execution, considering weekends (non-working days) and business hours (e.g., 9 AM to 5 PM).

*/