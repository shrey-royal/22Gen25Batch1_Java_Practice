import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSetMetaData;

public class MetaData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConn.getConnection();
            DatabaseMetaData dbmd = conn.getMetaData();

            System.out.println("Database Name: " + dbmd.getDatabaseProductName());
            System.out.println("Database Version: " + dbmd.getDatabaseProductVersion());
            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            System.out.println("UserName: " + dbmd.getUserName());
            System.out.println("URL: " + dbmd.getURL());

            ResultSetMetaData rsmd = conn.createStatement().executeQuery("SELECT * FROM pizzatoppingspreferences").getMetaData();

            System.out.println("Table Name: " + rsmd.getTableName(1));
            System.out.println("Column Count: " + rsmd.getColumnCount());
            System.out.println("Column Name of 1st Column: " + rsmd.getColumnName(1));
            System.out.println("Column Type Name of 1st Column: " + rsmd.getColumnTypeName(1));
            System.out.println("Column Type of 1st Column: " + rsmd.getColumnType(1));
            System.out.println("Column Display Size of 1st Column: " + rsmd.getColumnDisplaySize(1));
            System.out.println("Column Precision of 1st Column: " + rsmd.getPrecision(1));
            System.out.println("Column Scale of 1st Column: " + rsmd.getScale(1));
            System.out.println("Column is Nullable of 1st Column: " + rsmd.isNullable(1));
            System.out.println("Column is Auto Increment of 1st Column: " + rsmd.isAutoIncrement(1));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
