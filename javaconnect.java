/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Durgesh
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
   
    public static Connection ConnecrDb()
    {
           try
        {
            System.out.println("Conneted ");
          Class.forName("org.sqlite.JDBC");  
           Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Durgesh\\Documents\\NetBeansProjects\\Libarary Management System\\LibraryNew.db");
          return conn;
        }catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
        
