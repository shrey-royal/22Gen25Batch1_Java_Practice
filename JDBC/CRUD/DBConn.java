import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/5pm", "root", "root");

            if(conn != null)
                System.out.println("Database(5pm) Connected Successfully");
            else
                System.out.println("Failed to Connected with Database(5pm)");

            return conn;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    // public static void main(String[] args) {
    //     DBConn.getConnection();
    // }
}

/*
CREATE TABLE pizzatoppingspreferences (
  person_id INT NOT NULL AUTO_INCREMENT,
  pizza_lover_name VARCHAR(50) NOT NULL,
  favorite_topping VARCHAR(50),
  topping_confidence INT,
  unusual_combination TINYINT(1),
  PRIMARY KEY (person_id)
);
*/