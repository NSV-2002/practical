import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionDemo {
    public static void main(String[] args) {
        // JDBC URL, username and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/testdb"; // Replace 'testdb' with your database name
        String user = "root";       // Your DB username
        String password = "password"; // Your DB password

        Connection con = null;

        try {
            // Load JDBC driver (optional for newer versions of Java)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            con = DriverManager.getConnection(url, user, password);

            if (con != null) {
                System.out.println("Connection established successfully!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } finally {
            // Close connection
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}
