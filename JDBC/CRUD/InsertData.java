import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConn.getConnection();

            String query = "INSERT INTO pizzatoppingspreferences (pizza_lover_name, favorite_topping, topping_confidence, unusual_combination) VALUES (?, ?, ?, ?)";
            
            PreparedStatement pstmt = conn.prepareStatement(query);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter pizza lover name: ");
            pstmt.setString(1, sc.nextLine());

            System.out.print("Enter favorite topping: ");
            pstmt.setString(2, sc.nextLine());

            System.out.print("Enter topping confidence: ");
            pstmt.setInt(3, sc.nextInt());

            System.out.print("Enter unusual combination: ");
            pstmt.setBoolean(4, sc.nextBoolean());
            sc.close();

            if(pstmt.executeUpdate() > 0) System.out.println("Data Inserted Successfully");
            else System.out.println("Failed to Insert Data");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
