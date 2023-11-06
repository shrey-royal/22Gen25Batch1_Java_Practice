import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConn.getConnection();

            String query = "DELETE FROM pizzatoppingspreferences WHERE pizza_lover_name = ?";
            
            PreparedStatement pstmt = conn.prepareStatement(query);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter pizza lover name: ");
            pstmt.setString(1, sc.nextLine());
            sc.close();

            if(pstmt.executeUpdate() > 0) System.out.println("Data Deleted Successfully");
            else System.out.println("Failed to Deleted Data");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
