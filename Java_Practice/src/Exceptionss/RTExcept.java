public class RTExcept {
    public static void main(String[] args) {
        //Null Pointer Exception
        // String str = null;  //pointing to null
        // System.out.println(str.length());   //null pointer exception

        //Arithmetic Exception
        // int result = 10/0;

        //ArrayIndexOutOfBounds Exception
        // int []arr = {1, 2, 3, 4, 5};
        // System.out.println(arr[5]); //array index out of bounds exception

        //ClassCast Exception
        // Object obj = "Hello";
        // Integer num = (Integer) obj;

        //NumberFormat Exception
        // String str = "abc";
        // int num = Integer.parseInt(str);

        //IllegalArgument Exception
        someMethod(Integer.parseInt(System.console().readLine())); //illegal argument exception
    }

    private static void someMethod(int i) {
        if(i < 0) {
            throw new IllegalArgumentException("Number is negative");
        }
    }
}
