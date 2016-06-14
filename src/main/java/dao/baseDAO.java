package dao;

/**
 * Created by 187z on 6/6/2016.
 */
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;

public class baseDAO {
    protected final Connection getConnection() {
        Connection result = null;

        try {
            InitialContext ic = new InitialContext();
            DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/MySQLDS");

            result = ds.getConnection();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return result;
    }
}