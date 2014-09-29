package training.ideas.java.decisions;
import java.sql.*;
/**
 * Created by idnamb on 24-09-2014.
 */
public class DBConnection {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/movenpick1525_05db";
    static final String USER = "admin";
    static final String PASS = "admin";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT propertyID, shortName, propertyAccountID FROM property";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                int Pid  = rs.getInt("propertyID");
                String shortName = rs.getString("shortName");
                String propertyAccountID  = rs.getString("propertyAccountID");
                System.out.print(" " + Pid);
                System.out.print("," + shortName);
                System.out.print("," + propertyAccountID + "\n");
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            se.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



    }
}




