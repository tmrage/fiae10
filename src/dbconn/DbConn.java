package dbconn;

import java.sql.*;

public class DbConn {

    private String host;

    private String user;

    private String pass;

    public DbConn(String host, String user, String pass) {
        try {
            this.host = host;
            this.user = user;
            this.pass = pass;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":1521:xe", user, pass)) {
                ResultSet res = conn.createStatement().executeQuery("SELECT * FROM DEMO_USERS");
                while (res.next()) {
                    System.out.println(res.getString(2));
                }
                conn.close();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }
}
