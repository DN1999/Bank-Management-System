/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmsys.dao;

import bmsys.dbutil.DatabaseConnection;
import bmsys.po.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author राधे~राधे !
 */
public class Admindao {
    public static String isValidLogin(Employee c) throws SQLException
    {
         Connection con;
        con = DatabaseConnection.getConnection();
        PreparedStatement ps;
        String ui=c.getUserId();
        String pw=c.getPassword();
        String sql="select id from admin where id = '"+ui+"' and password = '"+pw+"'";
        //String sql="select userid from createcustomer where userid = ? and password = ?";
        ps = con.prepareStatement(sql);
        ResultSet rs= ps.executeQuery(sql);
        String loginid = null;
        if(rs.next())
        {
            loginid=rs.getString(1);
        }
        return loginid;
    
    }
    
}
