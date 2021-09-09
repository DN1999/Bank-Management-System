/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmsys.gui;

import bmsys.dao.Employeedao;
import bmsys.po.Employee;
import javax.swing.JOptionPane;

/**
 *
 * @author राधे~राधे !
 */
public class EmployeeLogin extends javax.swing.JFrame {

    /**
     * Creates new form CustomerLogin
     */
    public EmployeeLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1270, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Login");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1260, 90);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 0));
        jLabel3.setText("Employee ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 250, 180, 50);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(570, 250, 240, 50);

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(570, 360, 240, 50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 0));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 370, 130, 40);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(610, 500, 150, 50);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("Create Account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1040, 100, 210, 50);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 500, 150, 50);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton4.setText("<<");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 680, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginbg5.jpeg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, 90, 1260, 730);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new EmployeeCreateAccount().show();
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Employee c=new Employee();
        try
        {
            c.setUserId(jTextField1.getText());
            c.setPassword(jPasswordField1.getText());
            if(c.getUserId().isEmpty()||c.getPassword().isEmpty())
            {
                JOptionPane.showMessageDialog(null," Provide Employee ID / Password","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
              String userid= Employeedao.isValidLogin(c);
              if(userid.equals(c.getUserId()))
               {
                 JOptionPane.showMessageDialog(null,"Employee Login Succesfully","Log in",JOptionPane.INFORMATION_MESSAGE);
                 new EmployeeOption().show();
                 dispose();
               }
               else
               {
                 JOptionPane.showMessageDialog(null,"Employee ID / Password is Incorrect","Error",JOptionPane.ERROR_MESSAGE);
               }      
            }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"Employee ID/Pssword is Inccorect","Exception",JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new HomePage().show();
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}