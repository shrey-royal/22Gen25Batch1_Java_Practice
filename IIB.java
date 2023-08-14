class Sample {
    int x;
    int arr[];
    {   // Instance Initialization Block
        System.out.println("IIB Called");
        x = 10;
        arr = new int[5];
    }
    
    Sample() {
        System.out.println("Sample Constructor Called");
        // System.out.println("x = " + x);
    }
}

public class IIB {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample();
        s1 = new Sample();
        s2 = new Sample();
    }
}
