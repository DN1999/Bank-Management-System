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
import javax.swing.JOptionPane;

/**
 *
 * @author राधे~राधे !
*/
public class Employeedao {

 public static String CreateEmployee(Employee c) throws  SQLException
    {
     try{
        Connection con;
        con = DatabaseConnection.getConnection();
        PreparedStatement ps;
        String sql="insert into createemployee(ename,dob,age,gender,email,contactno,userid,password,state,country,position,panno,adharno,peraddress,tempaddress)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        ps = con.prepareStatement(sql);
        ps.setString(1,c.getEmployeeName());
        ps.setString(2,c.getDob());
        ps.setString(3,c.getAge());
        ps.setString(4,c.getGender());
        ps.setString(5,c.getEmail());
        ps.setString(6,c.getContactno());
        ps.setString(7,c.getUserId());
        ps.setString(8,c.getPassword());
        ps.setString(9,c.getState());
        ps.setString(10,c.getCountry());
        ps.setString(11,c.getPosition());
        ps.setString(12,c.getPanNo());
        ps.setString(13,c.getAdharNo());
        ps.setString(14,c.getPerAddress());
        ps.setString(15,c.getTempAddress());
        ps.executeUpdate();
        
     }catch(Exception e)
     {
      JOptionPane.showMessageDialog(null,e+"Some Fie");
     }
     return null; 
    } 
  public static String UpdateEmployee(Employee c) throws  SQLException
    {
     try{
        Connection con;
        con = DatabaseConnection.getConnection();
        // Statement ps;
         //ps=con.createStatement();
         PreparedStatement ps;
        String sql="update   createemployee  set ename=?,dob=?,age=?,gender=?,email=?,contactno=?,userid=?,password=?,state=?,country=?,position=?,panno=?,adharno=?,peraddress=?,tempaddress=?" +
     " where employeeid="+c.getEmployeeId()+"";
        ps = con.prepareStatement(sql);
        ps.setString(1,c.getEmployeeName());
        ps.setString(2,c.getDob());
        ps.setString(3,c.getAge());
        ps.setString(4,c.getGender());
        ps.setString(5,c.getEmail());
        ps.setString(6, c.getContactno());
        ps.setString(7,c.getUserId());
        ps.setString(8,c.getPassword());
        ps.setString(9,c.getState());
        ps.setString(10,c.getCountry());
        ps.setString(11,c.getPosition());
        ps.setString(12,c.getPanNo());
        ps.setString(13,c.getAdharNo());
        ps.setString(14,c.getPerAddress());
        ps.setString(15,c.getTempAddress());
        ps.executeUpdate();
        
     }catch(Exception e)
     {
      JOptionPane.showMessageDialog(null,e+"Some Fie");
     }
     return null; 
    }
 
  public static Employee SearchEmployee(String empid) throws SQLException
    {
        Employee c=new Employee();
     try
     {
        Connection con;
        con = DatabaseConnection.getConnection();
        PreparedStatement ps;
               
        String sql="select * from createemployee where employeeid=?";
        ps = con.prepareStatement(sql);
        ps.setString(1,empid);
        ResultSet rs = ps.executeQuery();
        if(rs.next()==true)
        {
            //c.setEmployeeId(rs.getString("empolyeeid"));
            c.setEmployeeName(rs.getString("ename"));
            c.setDob(rs.getString("dob"));
            c.setAge(rs.getString("age"));
            c.setGender(rs.getString("gender"));
            c.setEmail(rs.getString("email"));
            c.setContactno(rs.getString("contactno"));
            c.setUserId(rs.getString("userid"));
            c.setPassword(rs.getString("password"));
            c.setState(rs.getString("state"));
            c.setCountry(rs.getString("country"));
            c.setPosition(rs.getString("position"));
            c.setPanNo(rs.getString("panno"));
            c.setAdharNo(rs.getString("adharno"));
            c.setPerAddress(rs.getString("peraddress"));
            c.setTempAddress(rs.getString("tempaddress"));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Employee Id Not Found...","Error",JOptionPane.ERROR_MESSAGE);
        }
   
       } 
     catch(Exception e)
    {
     JOptionPane.showMessageDialog(null,e+"","Exception",JOptionPane.ERROR_MESSAGE);
    }
  return c;
 }
 public static boolean isValidEmail(String email) {
      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return email.matches(regex);
   }
    
    public static boolean isValidPanNo(String PanNo)
{
 // Regex to check valid PAN Card number.
        String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
         return PanNo.matches(regex);
}
 
    public static boolean isValidContactNo(String no)
    {
        int n=no.length();
      if(n==10)
      {
       return true;
      }
      else return false;
    }

    public static String isValidLogin(Employee c) throws SQLException
    {
         Connection con;
        con = DatabaseConnection.getConnection();
        PreparedStatement ps;
        String ui=c.getUserId();
        String pw=c.getPassword();
        String sql="select userid from createemployee where userid = '"+ui+"' and password = '"+pw+"'";
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

    public static boolean isValidUserId(Employee c) throws SQLException
    {
         Connection con;
        con = DatabaseConnection.getConnection();
        PreparedStatement ps;
        String ui=c.getUserId();
        String sql="select userid from createemployee where userid = '"+ui+"'";
        ps = con.prepareStatement(sql);
        ResultSet rs= ps.executeQuery(sql);
        String loginid = null;
        if(rs.next())
        {
            loginid=rs.getString(1);
        }
        if(loginid!=null)
        {
          return false;        
        }
        else
        {
         return true;
        }
    }    
    
    public static boolean isValidEmpployeeId(Employee c) throws SQLException
    {
         Connection con;
        con = DatabaseConnection.getConnection();
        PreparedStatement ps;
        String ui=c.getUserId();
        String empid=c.getEmployeeId();
        String sql="select userid from createemployee where userid = '"+ui+"' and employeeid="+empid+"";
        ps = con.prepareStatement(sql);
        ResultSet rs= ps.executeQuery(sql);
        String loginid = null;
        if(rs.next())
        {
            loginid=rs.getString(1);
        }
        if(loginid==empid)
        {
            System.out.println("in Emploeedao ,.. same"+empid);
          return true;        
        }
        else
        {
             System.out.println("in Emploeedao ,.. Not same"+empid);
         return false;
        }
    }    
    
}
