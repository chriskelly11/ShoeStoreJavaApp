/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ckelly3420Database_ShoeApplication;

/**
 *
 * @author chriskelly
 * 
 */

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.sql.ResultSet;
import java.io.PrintWriter;
import java.util.Locale;
import java.sql.ResultSet;
import java.lang.StringBuffer;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JTextField;

public class GBUtil {
    
    static void loadShoes(JComboBox<String> cbx){
     cbx.removeAllItems();
       String arr[] = { "All Shoes"};
        for (int x=0; x < arr.length; x++){
            cbx.addItem(arr[x]);
        }
     try {
         String sql = "SELECT DISTINCT name FROM clck_shoes";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
        
         if(cbx.getItemCount() > 0) {
             cbx.setSelectedIndex(0);
             GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         }
     } catch (SQLException e){
         e.printStackTrace();
     }
     
    }
        static void loadShoes4(JComboBox<String> cbx){
     cbx.removeAllItems();
     try {
         String sql = "SELECT DISTINCT name FROM clck_shoes";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
        
         if(cbx.getItemCount() > 0) {
             cbx.setSelectedIndex(0);
             GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         }
     } catch (SQLException e){
         e.printStackTrace();
     }
     
    }
    
    
    
    
    
    static void loadAdidas_models(JComboBox<String> cbx){
     cbx.removeAllItems();
     try {
         String sql = "SELECT DISTINCT model from clck_shoes s where s.name = 'Adidas'";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
         //if(cbx.getItemCount() > 0) {
          //   cbx.setSelectedIndex(0);
          //   GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         //}
     } catch (SQLException e){
         e.printStackTrace();
     }
    }
    static void loadUnder_models(JComboBox<String> cbx){
     cbx.removeAllItems();
     try {
         String sql = "SELECT DISTINCT model from clck_shoes s where s.name = 'Under Armor'";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
         if(cbx.getItemCount() > 0) {
             cbx.setSelectedIndex(0);
             GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         }
     } catch (SQLException e){
         e.printStackTrace();
     }
    }
    
    static void loadPuma_models(JComboBox<String> cbx){
     cbx.removeAllItems();
     try {
         String sql = "SELECT DISTINCT model from clck_shoes s where s.name = 'Puma'";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
         if(cbx.getItemCount() > 0) {
             cbx.setSelectedIndex(0);
             GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         }
     } catch (SQLException e){
         e.printStackTrace();
     }
    }
    
    static void loadReebok_models(JComboBox<String> cbx){
     cbx.removeAllItems();
     try {
         String sql = "SELECT DISTINCT model from clck_shoes s where s.name = 'Reebok'";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
         if(cbx.getItemCount() > 0) {
             cbx.setSelectedIndex(0);
             GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         }
     } catch (SQLException e){
         e.printStackTrace();
     }
    }
    
    static void loadDC_models(JComboBox<String> cbx){
     cbx.removeAllItems();
     try {
         String sql = "SELECT DISTINCT model from clck_shoes s where s.name = 'DC'";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
         if(cbx.getItemCount() > 0) {
             cbx.setSelectedIndex(0);
             GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         }
     } catch (SQLException e){
         e.printStackTrace();
     }
    }
    
    static void loadAsic_models(JComboBox<String> cbx){
     cbx.removeAllItems();
     try {
         String sql = "SELECT DISTINCT model from clck_shoes s where s.name = 'Asic'";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
         if(cbx.getItemCount() > 0) {
             cbx.setSelectedIndex(0);
             GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         }
     } catch (SQLException e){
         e.printStackTrace();
     }
    }
    
    static void load_sizes(JComboBox<String> cbx){
     cbx.removeAllItems();
     try {
         String sql = "SELECT s_size from clck_shoes s where s.name ='" +GBGlobals.a + "'" +" and s.model ='" + GBGlobals.Model + "'";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
         if(cbx.getItemCount() > 0) {
             cbx.setSelectedIndex(0);
             GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         }
     } catch (SQLException e){
         e.printStackTrace();
     }
    }
    static void load_Models(JComboBox<String> cbx){
     cbx.removeAllItems();
     try {
         String sql = "SELECT Model from clck_shoes where name ='" + GBGlobals.a + "'";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
         if(cbx.getItemCount() > 0) {
             cbx.setSelectedIndex(0);
             GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         }
     } catch (SQLException e){
         e.printStackTrace();
     }
    }
    
    
    
    
    
    
    static void loadVans_models(JComboBox<String> cbx){
     cbx.removeAllItems();
     try {
         String sql = "SELECT DISTINCT model from clck_shoes s where s.name = 'Vans'";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
         if(cbx.getItemCount() > 0) {
             cbx.setSelectedIndex(0);
             GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         }
     } catch (SQLException e){
         e.printStackTrace();
     }
    }
    
    static void loadSteve_models(JComboBox<String> cbx){
     cbx.removeAllItems();
     try {
         String sql = "SELECT DISTINCT model from clck_shoes s where s.name = 'Steve Madden'";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
         if(cbx.getItemCount() > 0) {
             cbx.setSelectedIndex(0);
             GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         }
     } catch (SQLException e){
         e.printStackTrace();
     }
    }
    
    static void loadGucci_models(JComboBox<String> cbx){
     cbx.removeAllItems();
     try {
         String sql = "SELECT DISTINCT model from clck_shoes s where s.name = 'Gucci'";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
         if(cbx.getItemCount() > 0) {
             cbx.setSelectedIndex(0);
             GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         }
     } catch (SQLException e){
         e.printStackTrace();
     }
    }
    
    
    static void loadNike_models(JComboBox<String> cbx){
     cbx.removeAllItems();
     try {
         String sql = "SELECT DISTINCT model from clck_shoes s where s.name = 'Nike'";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
         if(cbx.getItemCount() > 0) {
             cbx.setSelectedIndex(0);
             GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         }
     } catch (SQLException e){
         e.printStackTrace();
     }
    }
    
    static void loadEmployeeID(JComboBox<String> cbx){
     cbx.removeAllItems();
     try {
         String sql = "SELECT EmployeeID from clck_employee";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
         if(cbx.getItemCount() > 0) {
             cbx.setSelectedIndex(0);
             GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         }
     } catch (SQLException e){
         e.printStackTrace();
     }
    }
    
    
    
    static void loadYear(JComboBox<String> cbx){
     cbx.removeAllItems();
    
         String arr[] = {"2016","2017","2018","2019"};
         //String sql = "";
         //ResultSet rs = javaconnect.getResultSet(sql);
        for(int i=0; i < arr.length; i++){
            cbx.addItem(arr[i]);
        }
        if(cbx.getItemCount() > 0) {
            cbx.setSelectedIndex(0);
            GBGlobals.yYear = cbx.getSelectedItem().toString().toUpperCase();
        }  
   
    }
    
    
    static void loadShoes3(JComboBox<String> cbx){
     cbx.removeAllItems();
    
         String arr[] = {"Adidas","Nike","DC","Puma"};
         //String sql = "";
         //ResultSet rs = javaconnect.getResultSet(sql);
        for(int i=0; i < arr.length; i++){
            cbx.addItem(arr[i]);
        }
        /*
        if(cbx.getItemCount() > 0) {
            cbx.setSelectedIndex(0);
            GBGlobals.yYear = cbx.getSelectedItem().toString().toUpperCase();
        } 
*/
   
    }
    
    
    static void loadEmployees(JComboBox<String> cbx){
        cbx.removeAllItems();
        
        String empArr[] = { "BirthDate","EmployeeID"};
        for (int x=0; x < empArr.length; x++){
            cbx.addItem(empArr[x]);
        }
        if(cbx.getItemCount() > 0) {
            cbx.setSelectedIndex(0);
            GBGlobals.emp = cbx.getSelectedItem().toString().toUpperCase();
        }  
    }
    
    static void clearBox(JComboBox<String> cbx) {
        cbx.removeAllItems();
    }
    
    static void loadShoes2(JComboBox<String> cbx){
     cbx.removeAllItems();
     try {
         String sql = "SELECT DISTINCT Model FROM clck_shoes";
         ResultSet rs = javaconnect.getResultSet(sql);
         while(rs.next()) {
             cbx.addItem(rs.getString(1));
         }
         rs.close();
         if(cbx.getItemCount() > 0) {
             cbx.setSelectedIndex(0);
             GBGlobals.shoeName = cbx.getSelectedItem().toString().toUpperCase();
         }
     } catch (SQLException e){
         e.printStackTrace();
     }
    }
    
    
    static void loadSizes(JComboBox<String> cbx){
     cbx.removeAllItems();
     
     String arr[] = {"4.0","5.0","6.0","6.5","7.0","7.5","8.0","8.5","9.0","9.5","10.0",
                     "10.5","11.0","11.5","12.0","12.5","13.0","14.0","15.0","16.0"};
     for (int x=0; x < arr.length; x++){
            cbx.addItem(arr[x]);
        }
        if(cbx.getItemCount() > 0) {
            cbx.setSelectedIndex(0);
            GBGlobals.emp = cbx.getSelectedItem().toString().toUpperCase();
        }  
    }
    
    static void loadGender(JComboBox<String> cbx){
     cbx.removeAllItems();
     
     String arr[] = {"Male","Female"};
     for (int x=0; x < arr.length; x++){
            cbx.addItem(arr[x]);
        }
        if(cbx.getItemCount() > 0) {
            cbx.setSelectedIndex(0);
            GBGlobals.emp = cbx.getSelectedItem().toString().toUpperCase();
        }  
    }
    
      static String getFileName(String dir) {
        JFileChooser chooser = new JFileChooser(dir);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text File", "dat", "txt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            //System.out.println("getPath() : " + chooser.getSelectedFile().getName());
            //System.out.println("getAbsolutePath() : " + chooser.getSelectedFile().getAbsolutePath());
            //try { System.out.println("getCanonicalPath() : " + chooser.getSelectedFile().getCanonicalPath());} catch (Exception e) {}
            return chooser.getSelectedFile().getAbsolutePath(); // .getName() - File name only;
        }
        return null;
    }
         static void   printFileOnTextArea( String fileName, JTextArea ta) {
        String line = null;
        BufferedReader in  = null;
        int cnt = 0;
        ta.setText("");
        try {
            in = new BufferedReader ( new FileReader( fileName ));
            while ( (line = in.readLine())  != null) {
                ta.append(line + "\n");
                cnt++;
            }
        } catch (Exception e) { }
        try { in.close(); } catch (Exception e2) {}
        //ta.append(String.format("\nFile [%s] contains %d lines.\n", 
              //  fileName.substring(fileName.lastIndexOf("/") + 1), cnt));
    }
    
   
    
}
