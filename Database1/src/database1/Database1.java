/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database1;

import java.sql.*;
import java.sql.Connection;

/**
 *
 * @author ayla
 */
public class Database1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Load the Apache Derby embedded JDBC driver
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        
        // Establish a JDBC Connection with our database, SimpleDemoDB
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app"); 
        // The database URL
        
        //Execute a SQL query against the database and display the results
        
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery("SELECT * FROM APP.CUSTOMER");
        
        while (rs.next()) {
            String s = rs.getString("NAME");
            String c = rs.getString("CITY");
            System.out.println(s + "\t" +c);
        }
        
    }
    
    
}
