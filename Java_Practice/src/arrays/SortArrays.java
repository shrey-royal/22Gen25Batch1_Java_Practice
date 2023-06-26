//Write a Java program to sort a numeric array and a string array.

package arrays;

public class SortArrays {
    public static void main(String[] args) {
        int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456
        };
        
        String[] my_array2 = {
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };


        int a = (int)'#';
        int b = (int)' ';

        // System.out.println(Integer.parseInt(" "));
        System.out.println(a + "\t" + b);



        System.out.println("Original numeric array : ");
        printArray(my_array1);

        // Arrays.sort(my_array1);
        manualSort(my_array1);

        System.out.println("Sorted numeric array : ");
        printArray(my_array1);

        System.out.println("Original string array : ");
        printArray(my_array2);

        // Arrays.sort(my_array2);
        manualSort(my_array2);

        System.out.println("Sorted string array : ");
        printArray(my_array2);
    }

    public static void manualSort(int[] arr) {
        int n = arr.length;

        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void manualSort(String[] arr) {
        int n = arr.length;

        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } 
            }
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}

/*
 
OUTPUT: 
    Original numeric array : [1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456]
    Sorted numeric array : [1254, 1456, 1456, 1457, 1458, 1472, 1789, 1899, 2013, 2035, 2165, 2365, 2456, 2458]
    Original string array : [Java, Python, PHP, C#, C Programming, C++]
    Sorted string array : [C Programming, C#, C++, Java, PHP, Python]

Manually Sorted Attempt:
    Original numeric array : 
    [1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456]
    Sorted numeric array : 
    [1254, 1456, 1456, 1457, 1458, 1472, 1789, 1899, 2013, 2035, 2165, 2365, 2456, 2458]
    Original string array : 
    [Java, Python, PHP, C#, C Programming, C++]
    Sorted string array : 
    [C Programming, C#, C++, Java, PHP, Python]


Prit's Logic:

    System.out.println("Original numeric array : "+Arrays.toString(my_array1));
    Arrays.sort(my_array1);
    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
    System.out.println("Original string array : "+Arrays.toString(my_array2));
    Arrays.sort(my_array2);
    System.out.println("Sorted string array : "+Arrays.toString(my_array2));
*/