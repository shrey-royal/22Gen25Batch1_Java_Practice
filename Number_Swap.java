import java.util.Scanner;

public class Number_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number = sc.nextInt();
        sc.close();

        // String str = Integer.toString(number);
        char[] strNum = Integer.toString(number).toCharArray();
        int len = strNum.length;

        char temp = strNum[0];
        strNum[0] = strNum[len - 1];
        strNum[len - 1] = temp;

        System.out.println("The number after swapping: " + String.valueOf(strNum));

    }
}
