package easy.infra;
<<<<<<< HEAD:client-side/Easy-Infra/src/easy/infra/DBConnectionConfiguration.java
=======

>>>>>>> f6f13dea452a41792fa8b73f8b3bc72e6093e072:client-side/Easy-Infra/src/easy/infra/DBConnectionConfiguration.java
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by abhi on 22/2/16.
 */

/**
 * This class is used to establish a connection to the database
 * @author Abhilash.S
 * @version 1.0
 */
public class DBConnectionConfiguration {
    /**
     * This method creates a connection to the remote database using the mysql driver for JAVA
     * @return the connection instance to the remote database
     */
    public static Connection getConnection(){

        Connection connection = null;
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trial","root","root");
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
