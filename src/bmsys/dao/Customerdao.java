/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmsys.dao;
import java.sql.SQLException;
import bmsys.po.Customer;
import bmsys.dbutil.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author राधे~राधे !
 */
public class Customerdao {
    public static String validateCustomer(Customer c) throws  SQLException
    {
     try{
        Connection con;
        con = DatabaseConnection.getConnection();
        // Statement ps;
         //ps=con.createStatement();
         PreparedStatement ps;
        String sql="insert into createcustomer(ahname,dob,age,gender,email,contactno,userid,password,nomineename,state,country,accounttype,panno,adharno,peraddress,tempaddress)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        ps = con.prepareStatement(sql);
        ps.setString(1,c.getAccHolderName());
        ps.setString(2,c.getDob());
        ps.setString(3,c.getAge());
        ps.setString(4,c.getGender());
        ps.setString(5,c.getEmail());
        ps.setString(6, c.getContactno());
        ps.setString(7,c.getUserId());
        ps.setString(8,c.getPassword());
        ps.setString(9,c.getNomineeName());
        ps.setString(10,c.getState());
        ps.setString(11,c.getCountry());
        ps.setString(12,c.getAccType());
        ps.setString(13,c.getPanNo());
        ps.setString(14,c.getAdharNo());
        ps.setString(15,c.getPerAddress());
        ps.setString(16,c.getTempAddress());
        ps.executeUpdate();
        
     }catch(Exception e)
     {
      //JOptionPane.showMessageDialog(null,"Some Fie");
     }
     return null; 
    }
    
    public static String isValidLogin(Customer c) throws SQLException
    {
         Connection con;
        con = DatabaseConnection.getConnection();
        PreparedStatement ps;
        String ui=c.getUserId();
        String pw=c.getPassword();
        String sql="select userid from createcustomer where userid = '"+ui+"' and password = '"+pw+"'";
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
    
      public static boolean isValidUserId(Customer c) throws SQLException
    {
         Connection con;
        con = DatabaseConnection.getConnection();
        PreparedStatement ps;
        String ui=c.getUserId();
        String sql="select userid from createCustomer where userid = '"+ui+"'";
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

    public static String CreateCustomer(Customer c) throws  SQLException
    {
     try{
        Connection con;
        con = DatabaseConnection.getConnection();
        // Statement ps;
         //ps=con.createStatement();
         PreparedStatement ps;
        String sql="insert into customer(ahname,dob,age,gender,email,contactno,nomineename,state,country,accounttype,panno,adharno,peraddress,tempaddress)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        ps = con.prepareStatement(sql);
        ps.setString(1,c.getAccHolderName());
        ps.setString(2,c.getDob());
        ps.setString(3,c.getAge());
        ps.setString(4,c.getGender());
        ps.setString(5,c.getEmail());
        ps.setString(6, c.getContactno());
        ps.setString(7,c.getNomineeName());
        ps.setString(8,c.getState());
        ps.setString(9,c.getCountry());
        ps.setString(10,c.getAccType());
        ps.setString(11,c.getPanNo());
        ps.setString(12,c.getAdharNo());
        ps.setString(13,c.getPerAddress());
        ps.setString(14,c.getTempAddress());
        ps.executeUpdate();
        
     }catch(Exception e)
     {
      //JOptionPane.showMessageDialog(null,"Some Fie");
     }
     return null; 
    }

     public static String UpdateCustomer(Customer c) throws  SQLException
    {
     try{
        Connection con;
        con = DatabaseConnection.getConnection();
        // Statement ps;
         //ps=con.createStatement();
         PreparedStatement ps;
        String sql="update  customer set ahname=?,dob=?,age=?,gender=?,email=?,contactno=?,nomineename=?,state=?,country=?,accounttype=?,panno=?,adharno=?,peraddress=?,tempaddress=? where accountno="+c.getAccountNo()+"";
        ps = con.prepareStatement(sql);
        ps.setString(1,c.getAccHolderName());
        ps.setString(2,c.getDob());
        ps.setString(3,c.getAge());
        ps.setString(4,c.getGender());
        ps.setString(5,c.getEmail());
        ps.setString(6, c.getContactno());
        ps.setString(7,c.getNomineeName());
        ps.setString(8,c.getState());
        ps.setString(9,c.getCountry());
        ps.setString(10,c.getAccType());
        ps.setString(11,c.getPanNo());
        ps.setString(12,c.getAdharNo());
        ps.setString(13,c.getPerAddress());
        ps.setString(14,c.getTempAddress());
        ps.executeUpdate();
        
     }catch(Exception e)
     {
      JOptionPane.showMessageDialog(null,e+"Some Fie");
     }
     return null; 
    }

 public static void ShowCustomerRecord(DefaultTableModel m1) throws SQLException
    {
     try
     {
        Connection con;
        con = DatabaseConnection.getConnection();
        PreparedStatement ps;
        String sql="select * from customer";
        ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
     
        m1.setRowCount(0);
        while(rs.next())
        {
            m1.addRow(new Object[]{rs.getString("accountno"),rs.getString("ahname"),rs.getString("dob"),rs.getString("age"),rs.getString("gender"),rs.getString("email"),rs.getString("contactno"),rs.getString("nomineename"),rs.getString("state"),rs.getString("country"),rs.getString("accounttype"),rs.getString("panno"),rs.getString("adharno"),rs.getString("peraddress"),rs.getString("tempaddress")});
        }
     } 
     catch(Exception e)
    {
     JOptionPane.showMessageDialog(null,e+"","Exception",JOptionPane.ERROR_MESSAGE);
    }
  }

 public static void ShowTransactionRecord(DefaultTableModel m1) throws SQLException
    {
     try
     {
        Connection con;
        con = DatabaseConnection.getConnection();
        PreparedStatement ps;
        String sql="select * from transaction";
        ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
     
        m1.setRowCount(0);
        while(rs.next())
        {
            m1.addRow(new Object[]{rs.getString("transactionno"),rs.getString("ahname"),
           rs.getString("accounttype"),rs.getString("tdate"),rs.getString("ttime"),
           rs.getString("depositeaccno"),rs.getString("withdrawaccno"),rs.getString("transferfrom"),
           rs.getString("transferTo"),rs.getString("credit"),rs.getString("debit"),
           rs.getString("Balance"),
            });
        }
     } 
     catch(Exception e)
    {
     JOptionPane.showMessageDialog(null,e+"","Exception",JOptionPane.ERROR_MESSAGE);
    }
  }

 public static void ShowTransactionSingleRecord(DefaultTableModel m1,String accno) throws SQLException
    {
     try
     {
        Connection con;
        con = DatabaseConnection.getConnection();
        PreparedStatement ps;
        
        String sql="select * from transaction where accountno=? ";
        ps = con.prepareStatement(sql);
        ps.setString(1, accno);
        ResultSet rs = ps.executeQuery();
     
        m1.setRowCount(0);
        while(rs.next())
        {
            m1.addRow(new Object[]{rs.getString("transactionno"),rs.getString("ahname"),rs.getString("accounttype"),rs.getString("tdate"),rs.getString("ttime"),rs.getString("depositeaccno"),rs.getString("withdrawaccno"),rs.getString("transferfrom"),rs.getString("transferTo"),rs.getString("credit"),rs.getString("debit"),rs.getString("Balance"),
        });
        }
     } 
     catch(Exception e)
    {
     JOptionPane.showMessageDialog(null,e+"","Exception",JOptionPane.ERROR_MESSAGE);
    }
  }
 
 public static String AddTransaction(Customer c) throws  SQLException
    {
     try{
        Connection con;
        con = DatabaseConnection.getConnection();
        // Statement ps;
         //ps=con.createStatement();
         PreparedStatement ps;
        String sql="insert into transaction(tdate,ttime,accounttype,depositeaccno,withdrawaccno,transferfrom,transferTo,ahname,credit,debit,Balance,accountno)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?)";
        
        ps = con.prepareStatement(sql);
        ps.setString(1,c.getTdate());
        ps.setString(2,c.getTtime());
        ps.setString(3,c.getAccounttype());
        ps.setString(4,c.getDepositeaccno());
        ps.setString(5, c.getWithdrawaccno());
        ps.setString(6,c.getTransferfrom());
        ps.setString(7,c.getTransferTo());
        ps.setString(8,c.getAccHolderName());
        ps.setString(9, c.getCredit());
        ps.setString(10, c.getDebit());        
        ps.setString(11,c.getBalance());
        ps.setString(12,c.getAccountNo());
        System.out.println(c.getBalance()+"inside deposite sql"+ " Acc No"+c.getAccountNo());
     
        ps.executeUpdate();
        
     }catch(Exception e)
     {
      JOptionPane.showMessageDialog(null,e+"Some Fie");
     }
     return null; 
    }

 public static Customer SearchCustomer(String accountno) throws SQLException
    {
        Customer c=new Customer();
     try
     {
        Connection con;
        con = DatabaseConnection.getConnection();
        PreparedStatement ps;
               
        String sql="select * from customer where accountno=?";
        ps = con.prepareStatement(sql);
        ps.setString(1,accountno);
        ResultSet rs = ps.executeQuery();
        if(rs.next()==true)
        {
            c.setAccountNo(rs.getString("accountno"));
            c.setAccHolderName(rs.getString("ahname"));
            c.setDob(rs.getString("dob"));
            c.setAge(rs.getString("age"));
            c.setGender(rs.getString("gender"));
            c.setEmail(rs.getString("email"));
            c.setContactno(rs.getString("contactno"));
            c.setNomineeName(rs.getString("nomineename"));
            c.setState(rs.getString("state"));
            c.setCountry(rs.getString("country"));
            c.setAccType(rs.getString("accountType"));
            c.setPanNo(rs.getString("panno"));
            c.setAdharNo(rs.getString("adharno"));
            c.setPerAddress(rs.getString("peraddress"));
            c.setTempAddress(rs.getString("tempaddress"));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Account Id Not Found...","Error",JOptionPane.ERROR_MESSAGE);
        }
         sql = "select * from transaction where accountno=? order by transactionno desc";
        ps = con.prepareStatement(sql);
        ps.setString(1,accountno);
        rs = ps.executeQuery();
        //String id="";
        if(rs.next()==true)
        {
           c.setBalance(rs.getString("Balance"));
        }
   
       } 
     catch(Exception e)
    {
     JOptionPane.showMessageDialog(null,e+"","Exception",JOptionPane.ERROR_MESSAGE);
    }
  return c;
 }

 public static Customer FetchBalance(String accountno) throws SQLException
    {
     Customer c=new Customer();
     try
     {
        Connection con;
        con = DatabaseConnection.getConnection();
        PreparedStatement ps;
        String sql = "select * from transaction where accountno=? order by transactionno desc";
        ps = con.prepareStatement(sql);
        ps.setString(1,accountno);
       ResultSet rs,rs1; 
       rs = ps.executeQuery();
        String id="";
        if(rs.next()==true)
        {
           c.setBalance(rs.getString("Balance"));
        }
  /*      else
        {
            JOptionPane.showMessageDialog(null,"Account Id Not Found...","Error",JOptionPane.ERROR_MESSAGE);
        }*/
       } 
     catch(Exception e)
    {
      JOptionPane.showMessageDialog(null,e+"","Exception",JOptionPane.ERROR_MESSAGE);
    }
  return c;
 } 
 public static String D(Customer c) throws  SQLException
    {
     try{
        Connection con;
        con = DatabaseConnection.getConnection();
        // Statement ps;
         //ps=con.createStatement();
         PreparedStatement ps;
        String sql="insert into customer(ahname,dob,age,gender,email,contactno,nomineename,state,country,accounttype,panno,adharno,peraddress,tempaddress)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        ps = con.prepareStatement(sql);
        ps.setString(1,c.getAccHolderName());
        ps.setString(2,c.getDob());
        ps.setString(3,c.getAge());
        ps.setString(4,c.getGender());
        ps.setString(5,c.getEmail());
        ps.setString(6, c.getContactno());
        ps.setString(7,c.getNomineeName());
        ps.setString(8,c.getState());
        ps.setString(9,c.getCountry());
        ps.setString(10,c.getAccType());
        ps.setString(11,c.getPanNo());
        ps.setString(12,c.getAdharNo());
        ps.setString(13,c.getPerAddress());
        ps.setString(14,c.getTempAddress());
        ps.executeUpdate();
        
     }catch(Exception e)
     {
      //JOptionPane.showMessageDialog(null,"Some Fie");
     }
     return null; 
    }
 
        
}
