/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2disp2;
import javax.swing.JOptionPane;
/**
 *
 * @author nick
 */
public class Es2Disp2 {

    /**
     * @param args the command line arguments
     */
    public static String reverseString(String str) {
        
        String revStr = "";

        for (int i=str.length()-1; i>=0; i--)
            revStr += str.charAt(i);

        return revStr;
    }
    
    public static void main(String[] args) {
        
        String str, msg;
        int option;

        do {
            str = JOptionPane.showInputDialog("Inserisci una stringa");
            
            msg = "La stringa iniziale al contrario é: " + reverseString(str);
            JOptionPane.showMessageDialog(null, msg);
            
            option = JOptionPane.showConfirmDialog(null, "Rielaborare una nuova stringa?");
        } while (option == 0);
    }
    
}
