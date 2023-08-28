import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FierstProgram {
    public static void main(String[] args) {
        LocalDate obj = LocalDate.now();    //now method is used to get the current date
        System.out.println(obj);    //format -> yyyy-MM-dd

        LocalTime obj1 = LocalTime.now();    //now method is used to get the current time
        System.out.println(obj1);    //format -> HH-mm-ss-ns

        LocalDateTime obj2 = LocalDateTime.now();    //now method is used to get the current date and time
        System.out.println(obj2);    //format -> yyyy-MM-dd-HH-mm-ss-ns

        System.out.println("Before Formatting: " + obj2);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("E, dd-MM-yy HH:mm:ss");    //formatting the date and time
        String formatDateTime = obj2.format(format);

        System.out.println("After Formatting: " + formatDateTime);

        System.out.println("Today: " + obj.getDayOfWeek());
        System.out.println("Today: " + obj.getDayOfMonth());
        System.out.println("Today: " + obj.getDayOfYear());
    }
}

/*
java Date Class: package -> java.time

it includes 4 classes:
    1. LocalDate -> Represents a date (year, month, day (yyyy-MM-dd))
    2. LocalTime -> Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
    3. LocalDateTime -> Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
    4. DateTimeFormatter -> Formatter for displaying and parsing date-time objects


Tasks: 


Java Date Class Scenarios and Problems:

The `java.util.Date` class in Java is used to represent a specific point in time, with both date and time components. However, it's important to note that the `Date` class has some limitations and drawbacks, and it's recommended to use the `java.time` package introduced in Java 8 for more comprehensive date and time handling. Here are five scenarios/problems that involve the usage of the `Date` class, each related to real-world scenarios:

1. Event Countdown:
   You are developing an event management application. Implement a method that takes a `Date` object representing an upcoming event's date and time. Calculate and display the remaining time in days, hours, and minutes until the event. Handle cases where the event has already occurred or where the provided date is in the past.

2. Loan Due Date Calculation:
   In a banking application, create a method that takes a `Date` object representing a loan disbursement date and an integer representing the loan tenure in months. Calculate and display the due date for the loan repayment by adding the tenure to the disbursement date.

3. Age Calculator:
   Build an age calculator that takes a `Date` object representing a person's birthdate. Calculate and display the person's age in years, months, and days. Account for leap years and handle cases where the birthdate is in the future.

4. Task Scheduling:
   Develop a task scheduling application. Create a method that takes a `Date` object representing the current date and time, and an integer representing the number of days in the future. Determine and display the date and time that corresponds to the scheduled task execution, considering weekends (non-working days) and business hours (e.g., 9 AM to 5 PM).

5. Date Formatting and Parsing:
   Design a program that demonstrates date formatting and parsing. Create a method that takes a `Date` object and formats it into a user-friendly string representation like "August 28, 2023, 2:30 PM". Additionally, implement a method that takes a string representing a date in a specific format and parses it into a `Date` object.

Remember that the `java.util.Date` class has certain issues, such as lack of time zone information and mutability, which can lead to unexpected behavior. If you are working with modern Java versions (Java 8 and later), it's recommended to use the classes from the `java.time` package, such as `LocalDateTime`, `ZonedDateTime`, and `Period`, which provide better handling of date and time scenarios.
*/