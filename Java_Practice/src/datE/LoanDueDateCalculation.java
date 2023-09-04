import java.util.Date;
import java.util.Calendar;

public class LoanDueDateCalculation {

    public static Date calculateDueDate(Date disbursementDate, int tenureMonths) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(disbursementDate);
        calendar.add(Calendar.MONTH, tenureMonths);
        // Date dueDate = calendar.getTime();
        return calendar.getTime();
    }

    public static void main(String[] args) {
        Date disbursementDate = new Date();
        int tenureMonths = 13;

        Date dueDate = calculateDueDate(disbursementDate, tenureMonths);
        System.out.println("Due Date: " + dueDate);
    }
}
/*
2. Loan Due Date Calculation:
   In a banking application, create a method that takes a `Date` object representing a loan disbursement date and an integer representing the loan tenure in months. Calculate and display the due date for the loan repayment by adding the tenure to the disbursement date.
*/