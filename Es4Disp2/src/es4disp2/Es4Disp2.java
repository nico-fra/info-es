/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es4disp2;
import javax.swing.*;
/**
 *
 * @author nick
 */
public class Es4Disp2 {

    public static String strToUpper(String str) {
        String upperStr = "";
        
        for (int i=0; i<str.length(); i++)
            if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122)
                upperStr += (char) ((int) str.charAt(i)-32);
            else
                upperStr += str.charAt(i);
                
        return upperStr;
    }
    
    public static void main(String[] args) {
        String str;
        int option;
        
        do {
            str = JOptionPane.showInputDialog("Inserire una stringa");
                        
            JOptionPane.showMessageDialog(null, "La stringa in maiuscolo è: " + strToUpper(str));
            
            option = JOptionPane.showConfirmDialog(null, "Rielaborare una nuova stringa?");
        } while (option == 0);
    }
    
}
