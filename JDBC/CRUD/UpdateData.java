import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConn.getConnection();

            String query = "UPDATE pizzatoppingspreferences SET favorite_topping = ?, topping_confidence = ?, unusual_combination = ? WHERE pizza_lover_name = ?";
            
            PreparedStatement pstmt = conn.prepareStatement(query);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter pizza lover name: ");
            pstmt.setString(4, sc.nextLine());

            System.out.print("Enter favorite topping: ");
            pstmt.setString(1, sc.nextLine());

            System.out.print("Enter topping confidence: ");
            pstmt.setInt(2, sc.nextInt());

            System.out.print("Enter unusual combination: ");
            pstmt.setBoolean(3, sc.nextBoolean());
            sc.close();

            if(pstmt.executeUpdate() > 0) System.out.println("Data Updated Successfully");
            else System.out.println("Failed to Updated Data");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
