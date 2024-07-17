package Bank.Management.System;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest {
    public static void main(String ...args) throws SQLException {
        System.out.println("Establishing DB connection");

//        LoadDriver.loadDriver();

//        Connection connection = ConnectionUtil.getConnection();

        System.out.println("DB connection successful.");

//        String user = "CREATE TABLE user(id int, name varchar(100))";
        String insertUser = "INSERT INTO user(id, name) VALUES(1, \"AMAN\")";

        createTable(insertUser);
    }

    private static void createTable(String tableCreateStatement) throws SQLException {
        Statement statement = ConnectionUtil.getConnection().createStatement();
        boolean success = statement.execute(tableCreateStatement);
        System.out.println("Table created: " + success);
    }
}
