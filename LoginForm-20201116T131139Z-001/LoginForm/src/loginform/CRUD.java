/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tigusanjh_sd2081
 */
public class CRUD {

    
    public Connection connectToDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/userlist";
            //Create an Connection
            Connection connection = (Connection) DriverManager.getConnection(dbURL, "root", "");
            System.out.println("Connection Connected");
            return connection;
        } catch (Exception e) {
            System.out.println("Error Occur!!");
            return null;
        }
            
    
    }

    public boolean addData(String sqlString) {
        System.out.println(sqlString);
        try {
            Connection connection = connectToDB();
            java.sql.Statement statement = connection.createStatement();
            statement.executeUpdate(sqlString);
            connection.close();
            return true;
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
            return false;
        }
    }
    
    public ResultSet getData(String query) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = connectToDB();
            java.sql.Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            return rs;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
