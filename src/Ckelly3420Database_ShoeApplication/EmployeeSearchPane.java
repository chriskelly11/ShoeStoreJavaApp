/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ckelly3420Database_ShoeApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.math.BigDecimal;

//import org.apache.commons.lang3.math.NumberUtils;
/**
 *
 * @author ckelly
 */
public class EmployeeSearchPane extends javax.swing.JFrame {
Connection cnn = null;
ResultSet rs = null;
PreparedStatement pst = null;
    /**
     * Creates new form EmployeeSearchPane
     */
    public EmployeeSearchPane() {
        initComponents();
        cnn = javaconnect.getConnection();
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
        txt_search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_EmployeeID = new javax.swing.JTextField();
        txt_Fname = new javax.swing.JTextField();
        txt_Mname = new javax.swing.JTextField();
        txt_Lname = new javax.swing.JTextField();
        txt_Pnum = new javax.swing.JTextField();
        txt_zip = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_bdate = new javax.swing.JTextField();
        txt_State = new javax.swing.JTextField();
        txt_city = new javax.swing.JTextField();
        txt_ssn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("LiSong Pro", 3, 18)); // NOI18N
        jLabel1.setText("Employee Search Field");

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jLabel2.setText("Search:");

        jLabel3.setText("First Name");

        jLabel4.setText("EmployeeID");

        jLabel5.setText("Last Name");

        jLabel6.setText("Phone Number");

        jLabel7.setText("Zip");

        jLabel8.setText("Middle Name");

        txt_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cityActionPerformed(evt);
            }
        });

        jLabel9.setText("State");

        jLabel10.setText("SSN");

        jLabel11.setText("BirthDate");

        jLabel12.setText("City");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_city, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(txt_bdate)
                            .addComponent(txt_Fname)
                            .addComponent(txt_EmployeeID)
                            .addComponent(txt_Mname))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ssn)
                            .addComponent(txt_Lname)
                            .addComponent(txt_Pnum, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(txt_zip)
                            .addComponent(txt_State))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_EmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Mname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Pnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_zip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_bdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        try{
            String sql = "Select * from clck_employee where Fname=?";
            pst = cnn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            
            
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("EmployeeID");
                txt_EmployeeID.setText(add1);
                String add2=rs.getString("Fname");
                txt_Fname.setText(add2);
                String add3=rs.getString("Mname");
                txt_Mname.setText(add3);
                String add4=rs.getString("Lname");
                txt_Lname.setText(add4);
                String add5=rs.getString("PhoneNumber");
                txt_Pnum.setText(add5);
                String add6=rs.getString("SSN");
                txt_ssn.setText(add6);
                String add7=rs.getString("BirthDate");
                txt_bdate.setText(add7);
                String add8=rs.getString("City");
                txt_city.setText(add8);
                String add9=rs.getString("State");
                txt_State.setText(add9);
                String add10=rs.getString("Zip");
                txt_zip.setText(add10);
            }
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
         try{
            String sql = "Select * from clck_employee where Lname=?";
            pst = cnn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            
            
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("EmployeeID");
                txt_EmployeeID.setText(add1);
                String add2=rs.getString("Fname");
                txt_Fname.setText(add2);
                String add3=rs.getString("Mname");
                txt_Mname.setText(add3);
                String add4=rs.getString("Lname");
                txt_Lname.setText(add4);
                String add5=rs.getString("PhoneNumber");
                txt_Pnum.setText(add5);
                String add6=rs.getString("SSN");
                txt_ssn.setText(add6);
                String add7=rs.getString("BirthDate");
                txt_bdate.setText(add7);
                String add8=rs.getString("City");
                txt_city.setText(add8);
                String add9=rs.getString("State");
                txt_State.setText(add9);
                String add10=rs.getString("Zip");
                txt_zip.setText(add10);
            }
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String x =txt_search.getText();
        
         if(isNumeric(x) == true){
             
         
         try{
            String sql = "Select * from clck_employee where EmployeeID=?";
            pst = cnn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            
            
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("EmployeeID");
                txt_EmployeeID.setText(add1);
                String add2=rs.getString("Fname");
                txt_Fname.setText(add2);
                String add3=rs.getString("Mname");
                txt_Mname.setText(add3);
                String add4=rs.getString("Lname");
                txt_Lname.setText(add4);
                String add5=rs.getString("PhoneNumber");
                txt_Pnum.setText(add5);
                String add6=rs.getString("SSN");
                txt_ssn.setText(add6);
                String add7=rs.getString("BirthDate");
                txt_bdate.setText(add7);
                String add8=rs.getString("City");
                txt_city.setText(add8);
                String add9=rs.getString("State");
                txt_State.setText(add9);
                String add10=rs.getString("Zip");
                txt_zip.setText(add10);
            }
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
         }
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_txt_searchKeyReleased

    
    public boolean isNumeric(String s){
        return s.matches("[-+]?\\d*\\.?\\d+");
    }
    
    
    
    private void txt_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cityActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeSearchPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeSearchPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeSearchPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeSearchPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeSearchPane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_EmployeeID;
    private javax.swing.JTextField txt_Fname;
    private javax.swing.JTextField txt_Lname;
    private javax.swing.JTextField txt_Mname;
    private javax.swing.JTextField txt_Pnum;
    private javax.swing.JTextField txt_State;
    private javax.swing.JTextField txt_bdate;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_ssn;
    private javax.swing.JTextField txt_zip;
    // End of variables declaration//GEN-END:variables
}