/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volume.java;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author FA506IC
 */
public class VolumeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pilihan = JOptionPane.showInputDialog("MENGHITUNG VOLUME BANGUN RUANG \na. bola \nb. tabung \nc. kerucut \npilih bangun mana yang akan anda hitung (gunakan a / b / c) :");
        DecimalFormat deFormat = new DecimalFormat("#.0");
        if ("a".equals(pilihan)){
            float nilai = Float.parseFloat(JOptionPane.showInputDialog("masukkan nilai jari-jari atau r (cm):"));
            float bola = (((4f*22f*(nilai*nilai*nilai))/3f))/7f;
            JOptionPane.showMessageDialog(null,"volume bola tersebut adalah"+deFormat.format(bola)+"cm\u00B3");
        }
        else if ("b".equals(pilihan)){
            float nilaiR = Float.parseFloat(JOptionPane.showInputDialog("massukkan nilai jari-jari atau r(cm):"));
            float nilaiT = Float.parseFloat(JOptionPane.showInputDialog("masukkan nilai tinggi atau t(cm):"));
            float tabung = ((4f*22f*(nilaiR*nilaiR)*nilaiT)/3f)/7f;
            JOptionPane.showMessageDialog(null,"volume tabung tersebut adalah"+deFormat.format(tabung)+"cm\u00B3");
        }
        else if ("c".equals(pilihan)){
            float nilaiR = Float.parseFloat(JOptionPane.showInputDialog("masukkan nilai jari-jari atau r(cm):"));
            float nilaiT = Float.parseFloat(JOptionPane.showInputDialog("masukkan nilai tinggi atau t(cm):"));
            float kerucut = ((22f*nilaiR*nilaiR*nilaiT)/3f)/7f;
            JOptionPane.showMessageDialog(null,"volume kerucut tersebut adalah "+deFormat.format(kerucut)+" cm\u00B3");
        }
        else{
            JOptionPane.showMessageDialog(null,"masukkan input yang benar!");
        }
    }
    
}
