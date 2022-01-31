package chapter_15;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample {
    private static final String INSERT_SQL = "INSERT INTO employee " +
        "  (empid, name, email, country, password) VALUES " + " (?, ?, ?, ?, ?);";
    private static final String UPDATE_SQL = "update employee set name = ? where id = ?;";

    private static final String jdbcUrl = "jdbc:mysql://localhost:8080/mysql_database?useSSL=false";
    private static final String username = "admin";
    private static final String password = "admin";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);) {
            conn.setAutoCommit(false);
            try (PreparedStatement insertStmt = conn.prepareStatement(INSERT_SQL); PreparedStatement updateStmt = conn.prepareStatement(UPDATE_SQL);) {
                // Create insert statement with parameterized values
            	insertStmt.setInt(1, 200);
                insertStmt.setString(2, "java7");
                insertStmt.setString(3, "java7@mail.com");
                insertStmt.setString(4, "IN");
                insertStmt.setString(5, "password@123");
                
                // Execute the insert statement to feed the table
                insertStmt.executeUpdate();

                // Commit the changes into database
                conn.commit();
                
                System.out.println("Data inserted and committed successfully.");
            } catch (SQLException e) {
            	System.out.println(e);
                if (conn != null) {
                    try {
                        // Roll back transaction
                        System.out.println("Transaction is being rolled back.");
                        conn.rollback();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
