/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ckelly3420Database_ShoeApplication;

import static Ckelly3420Database_ShoeApplication.Shoe_Loader.cnn;
import static Ckelly3420Database_ShoeApplication.Shoe_Loader.pst;
import static Ckelly3420Database_ShoeApplication.javaconnect.cnn;
import static Ckelly3420Database_ShoeApplication.javaconnect.cstmt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author ckelly
 */
public class Shoe_Loader {
    public static Connection cnn= javaconnect.getConnection();
   // public static Statement pst = null;
    static ResultSet rs = null;
    public static PreparedStatement pst = null;
    static JTextArea rosterSheet = null;
    static String rosterData;
    static int dataLength;
        
    private static void populate_ShoeID() {
        String sql = "Select ShoeID from clck_shoes WHERE shoeID = (select Max(ShoeID) from clck_shoes)";
        try{
        pst = cnn.prepareStatement(sql);
        rs = pst.executeQuery();
        if(rs.next()){
        String y = rs.getString("ShoeID");
        int result = Integer.parseInt(y);
        int result2 = result+1;
        String result3 = Integer.toString(result2);
        GBGlobals.result = result3;
        //JOptionPane.showMessageDialog(null, GBGlobals.result);
       // CustomerID.setText(result3);
        }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public static void process( JTextArea Sheet ){
        rosterSheet = Sheet;
        rosterData = rosterSheet.getText();
        dataLength = rosterData.length();
        String[] tokens = rosterData.split("\\n");
        int count =0;
        String[] tokens2;
      for(int i=0; i < tokens.length;i++){
          //JOptionPane.showMessageDialog(null, tokens[i]);
          tokens2 = tokens[i].split(",");
            for(int j=0; j< tokens2.length; j++){
            //JOptionPane.showMessageDialog(null, tokens2[j]);
            GBGlobals.putty.add(tokens2[j]);
            }
      }
      // populate_ShoeID();
       //JOptionPane.showMessageDialog(null, GBGlobals.result);
 
      for(int z=0; z<tokens.length;z++){
     try {
          populate_ShoeID();
         // JOptionPane.showMessageDialog(null, GBGlobals.result);
          cstmt = cnn.prepareCall("{call clck_AddShoe (?,?,?,?,?,?)}");
          cstmt.setInt(1, Integer.parseInt(GBGlobals.result));
          String x =GBGlobals.putty.get(GBGlobals.n);
          x= x.valueOf(x).trim();
          cstmt.setInt(2, Integer.parseInt(x));
         // JOptionPane.showMessageDialog(null, GBGlobals.n);
          ++GBGlobals.n;
          String y =GBGlobals.putty.get(GBGlobals.n);
          y = y.valueOf(y).trim();
          cstmt.setString(3, y);
          ++GBGlobals.n;
          String p = GBGlobals.putty.get(GBGlobals.n);
          p = p.valueOf(p).trim();
          cstmt.setFloat(4, Float.parseFloat(p));
          ++GBGlobals.n;
          String q = GBGlobals.putty.get((GBGlobals.n));
          q = q.valueOf(q).trim();
          cstmt.setString(5,q);
          ++GBGlobals.n;
          String r = GBGlobals.putty.get((GBGlobals.n));
          r = r.valueOf(r).trim();
          cstmt.setString(6, r);
          ++GBGlobals.n;
          cstmt.execute();
          JOptionPane.showMessageDialog(null,"Saved");
            int count2 = cstmt.getUpdateCount();
            if (count2 < 0) {
               // return false;
            }
            cnn.commit();
           // return true;
         
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
      }
      
      
    }
    
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    
    
    
    

