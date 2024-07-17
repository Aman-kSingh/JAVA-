package Bank.Management.System;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
    private static Connection connection;
//    Statement statement;
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/bankSystem";
        String user = "root";
        String password = "Amansingh1998";

        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

        return connection;
    }
}
