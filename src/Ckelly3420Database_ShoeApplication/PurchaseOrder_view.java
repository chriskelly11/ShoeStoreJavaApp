/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ckelly3420Database_ShoeApplication;

import static Ckelly3420Database_ShoeApplication.javaconnect.cstmt;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chriskelly
 */
public class PurchaseOrder_view extends javax.swing.JFrame {
Connection cnn = null;
ResultSet rs = null;
PreparedStatement pst = null;
    /**
     * Creates new form PurchaseOrder_view
     */
    public PurchaseOrder_view() {
        cnn = javaconnect.getConnection();
        initComponents();
        GBUtil.loadAdidas_models(Model);
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        Date.setText(dateFormat.format(date));
        GBUtil.loadEmployeeID(EmployeeID);
        populate_OrderID();
        OrderID.setEditable(false);
        Date.setEditable(false);
        Price.setEditable(false);
        SubTotal.setEditable(false);
      //  ShoppingCart.setEditable(false);
        GBGlobals.sum2 =0;
        GBGlobals.keep = null;
       // JOptionPane.showMessageDialog(null, GBGlobals.keep);
        //JOptionPane.showMessageDialog(null, GBGlobals.sum2);
        GBGlobals.count=0;
        clearArray(GBGlobals.arr);
        SubTotal.setText("$0.00");
        
        

        // GBUtil.loadShoes(Brand);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        SubTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Print_Finish_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShoppingCart2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        RemoveItem = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        OrderID = new javax.swing.JTextField();
        Model = new javax.swing.JComboBox<String>();
        Size = new javax.swing.JComboBox<String>();
        Qty = new javax.swing.JComboBox<String>();
        EmployeeID = new javax.swing.JComboBox<String>();
        Brand = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Xingkai SC", 3, 36)); // NOI18N
        jLabel6.setText("Shopping Cart");

        SubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubTotalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Hiragino Kaku Gothic Std", 1, 13)); // NOI18N
        jLabel7.setText("Sub-Total:");

        Print_Finish_Button.setIcon(new javax.swing.ImageIcon("/Users/ckelly/Desktop/Shoe_Store_Database_Application/print.png")); // NOI18N
        Print_Finish_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_Finish_ButtonActionPerformed(evt);
            }
        });

        ShoppingCart2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model", "Shoe", "Size", "Qty", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ShoppingCart2);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buttons", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Athelas", 3, 14))); // NOI18N

        RemoveItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ckelly3420Database_ShoeApplication/2.jpg"))); // NOI18N
        RemoveItem.setToolTipText("Remove the selected Shoe from the cart below");
        RemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveItemActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("/Users/ckelly/Desktop/1.jpg")); // NOI18N
        jButton1.setToolTipText("Add Shoe/Shoes to cart below from the selected Field above");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ckelly3420Database_ShoeApplication/3.jpg"))); // NOI18N
        jButton3.setToolTipText("Clear the Shopping Cart Below");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(RemoveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jButton3)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RemoveItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Add-to-Cart Field", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel2.setText("model");

        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        jLabel5.setText("Price:   $");

        jLabel3.setText("Size");

        jLabel8.setText("EmployeeID");

        jLabel4.setText("Quantity");

        jLabel10.setText("Date:");

        jLabel1.setText("Brand");

        jLabel9.setText("Order ID #:");

        Model.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        Model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelActionPerformed(evt);
            }
        });

        Size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeActionPerformed(evt);
            }
        });

        Qty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyActionPerformed(evt);
            }
        });

        EmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeIDActionPerformed(evt);
            }
        });

        Brand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Adidas", "Under Armor", "Puma", "Reebok", "DC", "Asic", "Vans", "Nike", "Steve Madden", "Gucci", " " }));
        Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(Brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(Model, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Size, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(EmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Print_Finish_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Print_Finish_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_PriceActionPerformed

    private void BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandActionPerformed
        // TODO add your handling code here:
        GBUtil.clearBox(Model);
        
       // GBUtil.clearBox(Size);
        GBGlobals.a = (String)Brand.getSelectedItem();
        //JOptionPane.showMessageDialog(null,GBGlobals.input_1);
        
        if (GBGlobals.a.equals(GBGlobals.a)) {
            GBGlobals.a = (String)Brand.getSelectedItem();
            GBUtil.load_Models(Model);
        }
        
        /*
        else if(GBGlobals.a.equals("Adidas")){
            GBUtil.loadAdidas_models(Model);
            GBGlobals.Model = Model.getSelectedItem().toString();
           // JOptionPane.showMessageDialog(null, GBGlobals.Model);
            


           // JOptionPane.showMessageDialog(null,GBGlobals.Model);
         
        /*    
        }
        else if (GBGlobals.a == "Gucci"){
            GBUtil.loadGucci_models(Model);
        }
        else if (GBGlobals.a == "Under Armor") {
            GBUtil.loadUnder_models(Model);
        }
        else if (GBGlobals.a == "Puma"){
            GBUtil.loadPuma_models(Model);
        }
        else if(GBGlobals.a == "Reebok") {
            GBUtil.loadReebok_models(Model);
        }
        else if(GBGlobals.a == "DC"){
            GBUtil.loadDC_models(Model);
        }
        else if(GBGlobals.a == "Asic"){
            GBUtil.loadAsic_models(Model);
            
        }
        else if (GBGlobals.a == "Vans") {
            GBUtil.loadVans_models(Model);
        }
        else if (GBGlobals.a == "Steve Madden"){
            GBUtil.loadSteve_models(Model);
        }
        */
            
    }//GEN-LAST:event_BrandActionPerformed

     private void PopulatePrice(){
        GBGlobals.size = Size.getSelectedItem().toString();
        GBGlobals.a = Brand.getSelectedItem().toString();
        GBGlobals.Model = Model.getSelectedItem().toString();
        String sql = "SELECT Price from clck_shoes s where s.name ='" +GBGlobals.a + "'" +" and s.model ='" + GBGlobals.Model + "'" + "and s_size=" + GBGlobals.size;
        try{
            pst = cnn.prepareStatement(sql);
            rs = pst.executeQuery();
                if(rs.next()){
                    String y = rs.getString("Price");
                    Price.setText(y);
                }
            } catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       SubTotal.setText(null);
       GBGlobals.sum2 =0;
       String model =  Model.getSelectedItem().toString();
       String shoe = Brand.getSelectedItem().toString();
       String size = Size.getSelectedItem().toString();
       String qty = Qty.getSelectedItem().toString();
       String price = Price.getText().toString();
       int[] array = new int[500]; 
       int [] px = new int [500];
       int sum = 0;
       String Sentence = "Model: " + model + "  "+ "Shoe: " + shoe + "  " +"Size: "+ size + "  " + "Quantity: "+ qty + "  " +"Price: $" + price +".00"; 
       int n = Integer.parseInt(qty);
       int [] d = new int[5];
       int [] y = new int[500];

       int z = 0;
       int x =0;
       int p = Integer.parseInt(price);
       GBGlobals.arr[GBGlobals.count]= p*n;
       GBGlobals.count++;
       
       DefaultTableModel model1=(DefaultTableModel) ShoppingCart2.getModel();
       model1.addRow(new Object[]{model,shoe,size,qty,price}  );
      
       for(int j=0; j < GBGlobals.arr.length; j++){
          GBGlobals.sum2 += GBGlobals.arr[j];

       }
          

       
       GBGlobals.keep = Integer.toString(GBGlobals.sum2);
       
       SubTotal.setText("$"+GBGlobals.keep+".00");
      
       clearArray(array);
       clearArray(px);
       
       //JOptionPane.showMessageDialog(null, GBGlobals.ar.get(GBGlobals.count+1));

      // b = null;

      
       
       
       
       
        /*
        try{ 
            String sql = "select * from clck_shoes where name ='" + GBGlobals.a + "' and Model= '" + GBGlobals.Model + "'";
            pst = cnn.prepareStatement(sql);
            rs =pst.executeQuery();
           // ShoppingCart.setModel(DbUtils.resultSetToTableModel(rs));
    
    
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
       */
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelActionPerformed
        // TODO add your handling code here:
        GBUtil.clearBox(Size);
        Price.setText(null);
        if(Model.getItemCount() > 0){
            GBGlobals.Model =(String)Model.getSelectedItem();
            //JOptionPane.showMessageDialog(null, GBGlobals.Model);
                if(GBGlobals.Model.equals(GBGlobals.Model)){
                    GBGlobals.a =(String)Brand.getSelectedItem();
                    GBUtil.load_sizes(Size);
                    PopulatePrice();
                 }
                
        }
  
        
    }//GEN-LAST:event_ModelActionPerformed

    
    private void clearArray(int arr[]){
        for(int i=0; i < arr.length;i++){
            arr[i] = 0;
        }
    }
    
    
    
    
    
    
         private void populate_OrderID() {
        String sql = "Select PurchaseOrderID from clck_Purchaseorder WHERE PurchaseOrderID = (select Max(PurchaseOrderID) from clck_purchaseorder)";
        try{
        pst = cnn.prepareStatement(sql);
        rs = pst.executeQuery();
        if(rs.next()){
        String y = rs.getString("PurchaseOrderID");
        int result = Integer.parseInt(y);
        int result2 = result+1;
        String result3 = Integer.toString(result2);
        GBGlobals.result = result3;
        OrderID.setText(result3);
        }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
    
    
    
    
    private void SizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SizeActionPerformed
        // TODO add your handling code here:
        GBGlobals.size =(String) Size.getSelectedItem();
        Price.setText(null);
        if(Size.getItemCount() > 0){
            PopulatePrice();
            
        }
    }//GEN-LAST:event_SizeActionPerformed

    private void SubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubTotalActionPerformed

    private void EmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeIDActionPerformed

    private void Print_Finish_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_Finish_ButtonActionPerformed
        // TODO add your handling code here:
     //   String  text = ShoppingCart.getText();
     //   JOptionPane.showMessageDialog(null,text);
                
        String Oid = OrderID.getText();
        String D_date = Date.getText();
        
       // String S_id = 
        String E_id = EmployeeID.getSelectedItem().toString();
        String price = SubTotal.getText();
        String qt = Qty.getSelectedItem().toString();
        String brand = Brand.getSelectedItem().toString();
        String model = Model.getSelectedItem().toString();
        String size = Size.getSelectedItem().toString();
        String empID = EmployeeID.getSelectedItem().toString();
        String total = SubTotal.getText();
        SubTotal.setText(null);
        //ShoppingCart.getT
        String sql = "Select ShoeID from clck_shoes WHERE name ='" +brand+"' AND Model='"+ model +"' AND s_size="+ size;
        try{
        pst = cnn.prepareStatement(sql);
        rs = pst.executeQuery();
        if(rs.next()){
        String y = rs.getString("ShoeID");
        GBGlobals.box = Integer.parseInt(y);
        //GBGlobals.holder = y;
       // CustomerID.setText(result3);
        }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String sql1 = "Select Fname,Lname from clck_employee WHERE EmployeeID=" + empID;
        try{
            pst = cnn.prepareStatement(sql1);
            rs = pst.executeQuery();
            if(rs.next()){
                GBGlobals.fname = rs.getString("Fname");
                GBGlobals.lname = rs.getString("Lname");
            }
            
        }catch(Exception d){
            JOptionPane.showMessageDialog(null, d);
        }
        int id= Integer.parseInt(Oid);
        int id2 = GBGlobals.box;
        int qy = Integer.parseInt(qt);
        int ed = Integer.parseInt(E_id);
        price = price.replace("$","");
        //JOptionPane.showMessageDialog(null,id);
        //JOptionPane.showMessageDialog(null,id2);
        //JOptionPane.showMessageDialog(null,qy);
        //JOptionPane.showMessageDialog(null,ed);
        //JOptionPane.showMessageDialog(null,D_date);
        //JOptionPane.showMessageDialog(null,price);

        try{
        cstmt = cnn.prepareCall("{call clck_AddToCart(?,?,?,?,?,?)}");
        cstmt.setInt(1,id);
        cstmt.setString(2,D_date);
        cstmt.setInt(3,id2);
        cstmt.setString(4,price);
        cstmt.setInt(5,qy);
        cstmt.setInt(6,ed);
        cstmt.execute();
        cnn.commit();
        JOptionPane.showMessageDialog(null, "Purchase Complete");

        }catch(Exception c){
            JOptionPane.showMessageDialog(null, c);
        }
       // String List = ShoppingCart.getText();
        
        try{
        Document document = new Document();
       PdfWriter.getInstance(document, new FileOutputStream("Report.pdf"));
        
        document.open();
        Image img = Image.getInstance("logo.png");
        document.add(img);
        document.add(new Paragraph("GE SHOE SUPPLY CO. RECIPT ",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC,18,Font.BOLD,BaseColor.RED)));
        document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------"));
        document.add(new Paragraph("DATE:",FontFactory.getFont(FontFactory.TIMES_ITALIC)));
        document.add(new Paragraph(new Date().toString()));

        document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------"));
        PdfPTable pdfTable = new PdfPTable(ShoppingCart2.getColumnCount());
        for(int i =0; i < ShoppingCart2.getColumnCount(); i++){
            pdfTable.addCell(ShoppingCart2.getColumnName(i));
        }
        for(int rows=0; rows < ShoppingCart2.getRowCount(); rows++){
            for(int cols=0; cols < ShoppingCart2.getColumnCount(); cols++){
                pdfTable.addCell(ShoppingCart2.getModel().getValueAt(rows, cols).toString());
            }
        }
        document.add(pdfTable);
        document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------"));
        document.add(new Paragraph("SUBTOTAL: = $" + GBGlobals.sum2 +".00",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC,15,Font.BOLDITALIC,BaseColor.BLUE)));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("Employee Sale Information:",FontFactory.getFont(FontFactory.HELVETICA_BOLDOBLIQUE,10,Font.BOLD,BaseColor.RED)));
        document.add(new Paragraph("Employee Name: " + GBGlobals.fname + " " + GBGlobals.lname,FontFactory.getFont(FontFactory.TIMES_BOLDITALIC) ));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("\n")); 
        document.add(new Paragraph("Info@GEShoeSupplyco.com"));
        document.add(new Paragraph("5794 W. Burbank Blvd. Bakersfield CA, 91505 "));
        document.close();
        } catch(Exception z) {
            JOptionPane.showMessageDialog(null, z);
        }
        DefaultTableModel model1 = (DefaultTableModel) ShoppingCart2.getModel();
        model1.setRowCount(0);

        
    }//GEN-LAST:event_Print_Finish_ButtonActionPerformed

    private void QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_QtyActionPerformed

    private void RemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveItemActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model2 = (DefaultTableModel) ShoppingCart2.getModel();
        String total = SubTotal.getText();
        total = total.replace("$", "");
        total = total.replace(".00","");
       // JOptionPane.showMessageDialog(null, total);
        int total_1 = Integer.parseInt(total);
        int SelectedRowIndex = ShoppingCart2.getSelectedRow();
        if(SelectedRowIndex <0){
         JOptionPane.showMessageDialog(this, "Select a Shoe first to remove from cart"," NO SHOE SELECTED!", JOptionPane.WARNING_MESSAGE);
             return;
                 }
        String Table_click = (ShoppingCart2.getModel().getValueAt(SelectedRowIndex,4).toString());
        String Table_num = (ShoppingCart2.getModel().getValueAt(SelectedRowIndex,3).toString());

      //  JOptionPane.showMessageDialog(null, Table_click);
        int total_2 = Integer.parseInt(Table_click);
        int n = Integer.parseInt(Table_num);
        model2.removeRow(SelectedRowIndex);
        int sumb = total_1 - total_2*n;
        GBGlobals.sum2 = sumb;
        //JOptionPane.showMessageDialog(null,GBGlobals.sum2);
        String sen= Integer.toString(sumb);
        SubTotal.setText("$"+sen+".00");
        clearArray(GBGlobals.arr);
        
        
    }//GEN-LAST:event_RemoveItemActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model1 = (DefaultTableModel) ShoppingCart2.getModel();
        model1.setRowCount(0);
        clearArray(GBGlobals.arr);
        SubTotal.setText("$0.00");
    }//GEN-LAST:event_jButton3ActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(PurchaseOrder_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseOrder_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Brand;
    private javax.swing.JTextField Date;
    private javax.swing.JComboBox<String> EmployeeID;
    private javax.swing.JComboBox<String> Model;
    private javax.swing.JTextField OrderID;
    private javax.swing.JTextField Price;
    private javax.swing.JButton Print_Finish_Button;
    private javax.swing.JComboBox<String> Qty;
    private javax.swing.JButton RemoveItem;
    private javax.swing.JTable ShoppingCart2;
    private javax.swing.JComboBox<String> Size;
    private javax.swing.JTextField SubTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
