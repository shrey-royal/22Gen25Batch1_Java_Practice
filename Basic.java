/*

Basic Data types in java : 

char
int
float
double
boolean

Scanner class: 

Sources from where we can take input from user:
1. Keyboard - System.in
2. File - System.out
3. Network - System.net
4. String - System.String

Methods of Scanner class:
1. nextInt() - Takes integer input from user
2. nextFloat() - Takes float input from user
3. nextDouble() - Takes double input from user
4. nextLine() - Takes string input from user (scan till enter key is pressed)
5. next() - Takes single word input from user (scan till space is pressed)
6. nextBoolean() - Takes boolean input from user


*/

import java.util.Scanner;   // Importing Scanner class from java.util package

class Basic {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);    // Creating object of Scanner class
        
        System.out.println("Enter a number: ");
        int a = sc.nextInt();   // Taking integer input from user
        System.out.println("Enter a float number: ");
        float b = sc.nextFloat();   // Taking float input from user
        System.out.println("Enter a double number: ");
        double c = sc.nextDouble();   // Taking double input from user
        
        sc.nextLine();  // To clear the buffer
        System.out.println("Enter a string: ");
        String d = sc.nextLine();   // Taking string input from user
        System.out.println("Enter a boolean: ");
        boolean e = sc.nextBoolean();   // Taking boolean input from user
        // 1 - true / 0 - false
        System.out.println("Enter a word: ");
        String f = sc.next();   // Taking word input from user
        sc.next();  // To clear the buffer
        System.out.println("Enter a character: ");
        char g = sc.next().charAt(0);   // Taking character input from user
        
        sc.close(); // Closing Scanner class object

        
        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Double: " + c);
        System.out.println("String: " + d);
        System.out.println("Boolean: " + e);
        System.out.println("Word: " + f);
        System.out.println("Character: " + g);

        */


        //Take random number of 5 digit and print the 2nd even number
        
        // System.out.println((int)(Math.random() * 1000));  // 0 - 999 
        int num = (int)(Math.random() * 100000);    // 0 - 99999
        System.out.println(num);

        int count = 0;
        // for(initialization; condition; increment/decrement) {
        //     // code
        // }

        while(num > 0) {
            int rem = num % 10;
            if(rem % 2 == 0) {
                System.out.println("count++: " + rem);
                count++;
            }
            if(count == 2) {    // 2nd even number
                System.out.println("answer: " + rem);
                break;
            }
            num = num / 10;
        }
    }
}

/*
 * Tasks: 
 * 1. Take a number and print the 2nd even number fron the left side of the number
 * 
 * Sample input: 34850
 * 
 * Sample output: 8
 * 
 * 
 * 
 */