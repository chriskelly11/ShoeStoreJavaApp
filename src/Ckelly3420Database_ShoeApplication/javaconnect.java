package Ckelly3420Database_ShoeApplication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chriskelly
 */

import java.sql.*;
import java.sql.SQLException;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.util.*;

public class javaconnect {
    
    public static Connection cnn= null;
    public static Statement stmt = null;
    public static CallableStatement cstmt;
    public static String hostName = "delphi";
    public static String dbInstance = "dbs01";
    public static String dbUser = "cs3420",
                         passwd = "c3m4p2s",
                         url    = "jdbc:oracle:thin:@" + hostName + ".cs.csub.edu:1521:" + dbInstance;
    
    
    public static Connection getConnection() {
        try {
            if (cnn != null && cnn.isValid(3)) {
                return cnn;
            }
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            cnn = DriverManager.getConnection(url, dbUser, passwd);
            cnn.setAutoCommit(true);
            return cnn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static ResultSet getResultSet(String sql) {
        try {
            if (cnn == null) {
                getConnection();
            }
            stmt = cnn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            // stmt = cnn.createStatement( ); //ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            return stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static boolean addNewEmployee(String[] fieldValues){
        try {
         cstmt = cnn.prepareCall("{call clck_AddEmployee (?,?,?,?,?,?,?,?,?,?)}");
        
         for (int i = 0; i < fieldValues.length; i++) {
                if (i == 0) {
                    cstmt.setInt(i + 1, Integer.parseInt(fieldValues[i]));
                    //JOptionPane.showMessageDialog(null,fieldValues[i]);
                } else{
                    cstmt.setString(i + 1, fieldValues[i]);    
            }
         }

            cstmt.execute();
            int count = cstmt.getUpdateCount();
            if (count < 0) {
                return false;
            }
            cnn.commit();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
            return false;
        }   
    }
    
    public static boolean deleteEmployee(int emp){
        try{
            cstmt = cnn.prepareCall("{call clck_DeleteEmployee (?)");
            cstmt.setInt(1,emp);
            cstmt.execute();
            cnn.commit();
            return true;
            
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean deleteShoes(int emp){
        try{
            cstmt = cnn.prepareCall("{call clck_DeleteShoe (?)");
            cstmt.setInt(1,emp);
            cstmt.execute();
            cnn.commit();
            return true;
            
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    
    public static boolean addNewShoe(String[] fieldValues){
           try {
         cstmt = cnn.prepareCall("{call clck_AddShoe (?,?,?,?,?,?)}");
        
         for (int i = 0; i < fieldValues.length; i++) {
                if (i == 0 || i == 1) {
                    cstmt.setInt(i + 1, Integer.parseInt(fieldValues[i]));
                    //JOptionPane.showMessageDialog(null,fieldValues[i]);
                
                }else if(i == 3){
                    cstmt.setFloat(i+1, Float.parseFloat((fieldValues[i])));
                }else{
                    cstmt.setString(i + 1, fieldValues[i]);    
            }
         }

            cstmt.execute();
            int count = cstmt.getUpdateCount();
            if (count < 0) {
                return false;
            }
            cnn.commit();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
            return false;
        } 
        }
    }
    

