package _enum;

public class Sample {
    public enum Days_Of_Week {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public enum Weekends {
        SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Days_Of_Week today = Days_Of_Week.MONDAY;
        System.out.println("Today is " + today);

        Weekends day1 = Weekends.SATURDAY;
        Weekends day2 = Weekends.SUNDAY;
        
        System.out.println("Day1 is " + day1);
        System.out.println("Day2 is " + day2);
    }
}

/*
 * Enum is a special data type that enables for a variable to be a set of predefined constants. 
 * The variable must be equal to one of the values that have been predefined for it.
 */