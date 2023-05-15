// class Employee {
//     String name;    
//     double hourlyRate;
//     int hoursWorked;

//     public Employee(String name, double hourlyRate, int hoursWorked) {
//         this.name = name;
//         this.hourlyRate = hourlyRate;
//         this.hoursWorked = hoursWorked;
//     }
// }

// public class Loops_Problems {
//     public static void main(String[] args) {
//         Employee employee[] = {
//             new Employee("John", 10.0, 40),
//             new Employee("Mary", 15.0, 30),
//             new Employee("Steve", 12.0, 35)
//         };

//         for (int i = 0; i < 3; i++) {
//             double salary = employee[i].hourlyRate * employee[i].hoursWorked;
//             System.out.println(employee[i].name + " earned $" + salary);
//         }
//     }
// }


public class Loops_Problems {
    public static void main(String[] args) {
        String empName[] = {"John", "Mary", "Steve"};
        double hourlyRate[] = {10.0, 15.0, 12.0};
        int hoursWorked[] = {40, 30, 35};

        for (int i = 0; i < 3; i++) {
            double salary = hourlyRate[i] * hoursWorked[i];
            System.out.println(empName[i] + " earned $" + salary);
        }
    }
}

/*

Write a Java program to count number of digits in a number.
input: 12345 /  output: 5
Write a Java program to find first and last digit of a number.
input: 12345 /  output: 1, 5
Write a Java program to find sum of first and last digit of a number.
input: 12345 /  output: 6
Write a Java program to swap first and last digits of a number.
input: 12345 /  output: 52341
Write a Java program to calculate sum of digits of a number.
input: 12345 /  output: 15
Write a Java program to calculate product of digits of a number.
input: 12345 /  output: 120
Write a Java program to enter a number and print its reverse.
input: 12345 /  output: 54321

Write a Java program to check whether a number is palindrome or not.
input: 12321 /  output: palindrome
Write a Java program to find frequency of each digit in a given integer.
input: 12345 /  output: 1 - 1, 2 - 1, 3 - 1, 4 - 1, 5 - 1
Write a Java program to print all ASCII character with their values.
input: 12345 /  output: 1 - 49, 2 - 50, 3 - 51, 4 - 52, 5 - 53
Write a Java program to find one's complement of a binary number.
input: 1010 /  output: 0101
Write a Java program to find power of a number using for loop.
input: 2, 3 /  output: 8
Write a Java program to find all factors of a number.
input: 12 /  output: 1, 2, 3, 4, 6, 12
Write a Java program to calculate factorial of a number.
input: 5 /  output: 120
*/