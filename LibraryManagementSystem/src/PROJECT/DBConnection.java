package PROJECT;
//------------------------------------------Database Connection----------------------------------------------------------
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {

    static final String url = "jdbc:mysql://localhost/5TECHGUYS";
    static final String userName = "root";
    static final String password = "123456";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, userName, password);
    }
}

