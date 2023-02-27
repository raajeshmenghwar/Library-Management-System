package PROJECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBC {

    // database setup;

    static final String url = "jdbc:mysql://localhost/5TECHGUYS";//Setting the URl---> Database Name
    static final String userName = "root";//UserName
    static final String password = "123456";//Password for our database

    static final String ViewIssuedBooks = "SELECT BookName, BookAuthor,RollNo FROM issuedbooks";
    static final String AVAILABLE = "SELECT * FROM totalbooks";//select all query for book table

    public static Connection connection() throws SQLException {
        return DriverManager.getConnection(url, userName, password);
    }
}