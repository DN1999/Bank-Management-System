/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmsys.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author राधे~राधे !
 */
public class DatabaseConnection {
     private static Connection con;
     static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bmsysdb","root","");
    //         JOptionPane.showMessageDialog(null,"Connection Established Succesfully..","Sucess",JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"Error Loading Driver.."+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Connection Not Established Please check Error code ","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    public static Connection getConnection()
    {
        return con;
    }
    public static void closedConnnection()
    {
        try
        {
            if(con != null)
            {   
                con.close();
            }    
        }
        catch(SQLException a)
        {
                     JOptionPane.showMessageDialog(null,"Connection Not Established Please check Error code ","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
