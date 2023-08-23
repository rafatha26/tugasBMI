

package com.mycompany.tugaspertama;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author FA506IC
 */
public class BMI {

    public static void main(String[] args) {
    String nama = JOptionPane.showInputDialog("masukkan nama(nama panggilan saja):");
    String beratAsli= JOptionPane.showInputDialog("masukkan berat badan(kg):");
    String tinggiAsli= JOptionPane.showInputDialog("masukkan tinggi badan(cm):");
    
    DecimalFormat numberformat = new DecimalFormat("#.0");
        
    float beratPound = Float.parseFloat(beratAsli)*2.20462f;
    float tinggiInci = Float.parseFloat(tinggiAsli)/2.54f;
        
    float hasil = beratPound/(tinggiInci*tinggiInci)*703f;
       
    JOptionPane.showMessageDialog(null, "berat badan (pound) = "+numberformat.format(beratPound)+"tinggi badan (inch) ="+numberformat.format(tinggiInci));
       
    if(hasil < 18.5){
           JOptionPane.showMessageDialog(null,"anda kekurangan berat badan!");       
    }
    else if (hasil >= 18.5 & hasil < 25){
           JOptionPane.showMessageDialog(null,"berat badan anda normal!");
    }
    else if (hasil >= 25 & hasil < 30) {
        JOptionPane.showMessageDialog(null,"anda kelebihan berat badan!");
    }
    else {
        JOptionPane.showMessageDialog(null,"anda obesitas!");
        
    }
  }
}

            
        
    

