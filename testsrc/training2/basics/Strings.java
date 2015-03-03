package training2.basics;

import org.junit.Test;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ResourceBundle;

/**
 * Created by idnamb on 16-01-2015.
 */
public class Strings {

    @Test
    public void mySqlConnection()throws Exception {
        ResourceBundle dbDetails = ResourceBundle.getBundle("training2.basics.dbSource");
        System.out.println();
        String host = dbDetails.getString("host");
        String port = dbDetails.getString("port");
        String database = dbDetails.getString("database");
        String dbURL = "jdbc:mysql://" + host + ":" + port + "/" + database;
        String userName = dbDetails.getString("username");
        String password = dbDetails.getString("password");
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbURL, userName, password);
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("Select * from property");
        while (rs.next()) {
            System.out.println(rs.getString(1) + "\t" + rs.getString(1) + "\t" + rs.getString(2));
        }
        rs.close();
        s.close();
        conn.close();

    }



    @Test

    public void dbconnection(){

        String host ="sidnrmsina6";
        String port ="36002";
        String username="admin";
        String password="admin";
        String dbName="movenpick1525_05db";
        String dbURL="jdbc:mysql://"+host+":"+port+"/"+dbName;

        Connection conn;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection(dbURL,username,password);
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("Select * from property");
            while(rs.next()){
                System.out.println(rs.getString(1)+ "\t"+rs.getString(1)+ "\t"+rs.getString(2));
            }
            rs.close();
            s.close();
            conn.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}