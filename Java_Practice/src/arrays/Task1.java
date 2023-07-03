package arrays;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        int left=0, right=nums.length-1;

        // int scanned_number = new java.util.Scanner(System.in).nextInt();
        // System.out.println("Scanned number: " + scanned_number);

        System.out.println("Original Array : " + java.util.Arrays.toString(nums));
        // java.util.Arrays.sort(nums);    // sort array
        // System.out.println("Ans: " + java.util.Arrays.toString(nums));    
        
        while(left < right) {
            /* while  0 at left increment left index */
            while (nums[left] == 0 && left < right) {
                left++;
            }

            /* while we see 1 at right decrement right index */
            while (nums[right] == 1 && left < right) {
                right--;
            }

            if (left < right) {
                nums[left] = 0;
                nums[right] = 1;
                left++;
                right--;
            }
        }//end while

        System.out.println("Array after segregation is : " + Arrays.toString(nums));
    }
}

// Arrays.sort

/*
Write a Java program to separate 0s and 1s in an array of 0s and 1s into left and right sides. 
Original Array : [0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1]
Array after segregation is : [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1] 
*/