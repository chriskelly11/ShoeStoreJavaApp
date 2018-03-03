/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ckelly3420Database_ShoeApplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 *
 * @author chriskelly
 */
public class RemoteLoad {
    class DigitsOnlyVerifier extends InputVerifier {
        public boolean verify(JComponent input){
            JTextField tf = (JTextField) input;
            return tf.getText().matches("[0-9]+");
        }
    }
    
    static final int hGap = 5, vGap = 1;
    Component parent = null;
    String    title = null;
    
    JPanel pane = new JPanel();
    JTextField txts[] = null;
    String values[] = null;
    JComboBox drop = new JComboBox();
    DigitsOnlyVerifier dVerifier  = new DigitsOnlyVerifier();
    
    public RemoteLoad (Component parent, String title, String recFieldsNames[] ) {
        String defValues [] = new String[recFieldsNames.length];
        for ( int i = 0; i < recFieldsNames.length; i++ ) defValues[i] = "";
        setup( parent, title, recFieldsNames, defValues);
    }
    
    public RemoteLoad (Component parent, String title, String recFieldsNames[], String[] defValues){
        setup(parent,title,recFieldsNames, defValues);
        
    }
    
    
    
    void setup(Component parent, String title, String recFieldsNames[], String defValues[]){
            this.parent = parent;
            this.title = title; 
            
            txts = new JTextField[recFieldsNames.length];
            values = new String[recFieldsNames.length];
           // drop = new JComboBox[recFieldsNames.length];
            pane.setLayout( new GridLayout(recFieldsNames.length, 2, hGap, vGap));
            
            for ( int i = 0; i < recFieldsNames.length; i ++ ) {
		pane.add( new JLabel ( recFieldsNames[i], SwingConstants.RIGHT ) );
		//txts[i] = new JTextField(defValues[i], 10);
                if(recFieldsNames[i].toString().equals("State")){
                   String[] StateStrings = { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "District of Columbia", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }; 
                   JComboBox drop = new JComboBox(StateStrings);
                   pane.add(drop);
                   GBGlobals.tate = drop.getSelectedItem().toString();
                  
                     
                }
                else if(recFieldsNames[i].toString().equals("Name")){
                    JComboBox shoe = new JComboBox();
                    GBUtil.loadShoes4(shoe);
                    pane.add(shoe);
                    GBGlobals.ShoeName = shoe.getSelectedItem().toString();
                }
                else if(recFieldsNames[i].toString().equals("Size")){
                    JComboBox shoe = new JComboBox();
                    GBUtil.loadSizes(shoe);
                    pane.add(shoe);
                    GBGlobals.SizeName = shoe.getSelectedItem().toString();
                }
                else if(recFieldsNames[i].toString().equals("Gender")){
                    JComboBox gender = new JComboBox();
                    GBUtil.loadGender(gender);
                    pane.add(gender);
                    GBGlobals.genderName = gender.getSelectedItem().toString();
                    
                    //values[i]= GBGlobals.gender;
                }
                else {
                    txts[i] = new JTextField(defValues[i], 10);
                    pane.add(txts[i]);
                   }
               // if ( i >= 0 && i <= 2 || i == 5 ) txts[i].setInputVerifier(dVerifier);
		//pane.add( txts[i] );
                
	
	}
    }
    
    String [] getRecord() {

	String options[] = {"Add", "Cancel" };

	int choice = JOptionPane.showOptionDialog(parent, pane, title, JOptionPane.YES_NO_OPTION,
			JOptionPane.PLAIN_MESSAGE, null, options, null);

	if ( choice != JOptionPane.YES_OPTION ) return null;

	for ( int i = 0; i < txts.length; i ++ ) {
            if (i == 8){
                values[i] = GBGlobals.tate;
            }
            /*
            else if(i == 4 && GBGlobals.flag == false){
                values[i]= GBGlobals.gender;
            }
            else if(i == 5 && GBGlobals.flag == false){
                values[i] = txts[i].getText();
            }
            */
            else{
                values[i] = txts[i].getText();
            }
        }

	return values;
   };
    
    
    
     String [] getRecord2() {

	String options[] = {"Add", "Cancel" };

	int choice = JOptionPane.showOptionDialog(parent, pane, title, JOptionPane.YES_NO_OPTION,
			JOptionPane.PLAIN_MESSAGE, null, options, null);

	if ( choice != JOptionPane.YES_OPTION ) return null;

	for ( int i = 0; i < txts.length; i ++ ) {
           if(i == 0 || i == 1){
               values[i] =txts[i].getText();
           }
           else if(i == 2) {
               values[i] = GBGlobals.ShoeName;
           }
           else if(i == 3){
               values[i] = GBGlobals.SizeName;
           }
           else if(i == 4){
               values[i] = GBGlobals.genderName;
           }
           else if(i == 5){
               values[i] = txts[i].getText();
           }
           
        }

	return values;
   };
}
