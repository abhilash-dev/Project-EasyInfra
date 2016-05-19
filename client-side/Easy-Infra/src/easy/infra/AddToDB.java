package easy.infra;
<<<<<<< HEAD:client-side/Easy-Infra/src/easy/infra/AddToDB.java
=======

>>>>>>> f6f13dea452a41792fa8b73f8b3bc72e6093e072:client-side/Easy-Infra/src/easy/infra/AddToDB.java
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by abhi on 23/2/16.
 */

/**
 * This class is used to add a DB object to a remote database
 * @author Abhilash.S
 * @version 1.0
 */
public class AddToDB {

    /**
     * This method is to insert a row into the remote database
     * @param object the DB object to be inserted into the database
     */
    public void insert(CreateDBObject object){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
            connection = DBConnectionConfiguration.getConnection();
            if (connection!=null)
            {
                preparedStatement = connection.prepareStatement("INSERT INTO "+object.getTableName()+" (year,month,date,hour,minute,second,millisecond,pRed,pYellow,pGreen) VALUES (?,?,?,?,?,?,?,?,?,?)");
                preparedStatement.setString(1,object.getYear());
                preparedStatement.setString(2,object.getMonth());
                preparedStatement.setString(3,object.getDate());
                preparedStatement.setString(4,object.getHour());
                preparedStatement.setString(5,object.getMinute());
                preparedStatement.setString(6,object.getSecond());
                preparedStatement.setString(7,object.getMillisecond());
                preparedStatement.setFloat(8,object.getpRed());
                preparedStatement.setFloat(9,object.getpYellow());
                preparedStatement.setFloat(10,object.getpGreen());

                preparedStatement.executeUpdate();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection!=null)
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

}
