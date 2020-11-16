/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;
    
    private DBConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/rms", "root", "");
    }
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        return (dBConnection == null) ? (dBConnection = new DBConnection()) : dBConnection;
    }
    
    public Connection getConnection(){
        return connection;
    }
}
