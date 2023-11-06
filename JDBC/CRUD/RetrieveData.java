import java.sql.Connection;
import java.sql.ResultSet;

public class RetrieveData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConn.getConnection();

            String query = "SELECT * FROM pizzatoppingspreferences";
            // Statement stmt = conn.createStatement();
            // ResultSet rs = stmt.executeQuery(query);
            ResultSet rs = conn.createStatement().executeQuery(query);

            System.out.println("ID\tName\tfav_top\ttop_conf\tunusual?");
            while(rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString("pizza_lover_name") + "\t" + rs.getString(3) + "\t" + rs.getInt(4) + "\t\t" + rs.getBoolean(5));
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
