import java.io.*;

public class CopyImageFile {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        int ctr=0;

        try {
            in = new FileInputStream("input.png");  // input.png is in the same directory as this file
            out = new FileOutputStream("output.png");   // output.png will be created in the same directory as this file
            int c;

            while((c = in.read()) != -1) {
                out.write(c);
                ctr++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O Error");
        } finally {
            try {
                if(in != null) {
                    in.close();
                }
                if(out != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }

            System.out.println("Done");
            System.out.println("Copied " + ctr + " bytes");
        }
    }
}