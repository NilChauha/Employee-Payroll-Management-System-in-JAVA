/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll.system;

/**
 *
 * @author Hyrex
 */

import java.sql.*;
import javax.swing.*;
public class db {
    
    
    
    Connection conn=null;
    public static Connection java_db(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\VC\\Downloads\\Payroll-Management-System-Project-in-Java-Netbeans-Source-Code\\Payroll Management System Project in Java Netbeans Source Code\\Mydatabase.sqlite");
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
      
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
