package utils;

import java.sql.*;

public class DBTest {

    String sqlSelectAllPersons = "SELECT * FROM users";
    String connectionUrl = "jdbc:mysql://94.73.150.229/db_ann_test?serverTimezone=UTC";

    public void getDB() {
        try (
                Connection conn = DriverManager.getConnection(connectionUrl, "db_ann_test", "NIod27D6SYlc29O");
                PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("name");
                String lastName = rs.getString("surname");

                // do something with the extracted data...
            }
        } catch (
                SQLException e) {
            // handle the exception
        }
    }
}
