/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es1disp2;
import javax.swing.JOptionPane;
/**
 *
 * @author nick
 */
public class Es1Disp2 {

    /**
     * @param args the command line arguments
     */
    public static boolean checkPalindrome(String str) {
        
        for (int i=0; i < str.length() - 1; i++)
            if (str.charAt(i) != str.charAt(str.length()-i-1))
                return false;
        
        return true;
    }
    
    public static void main(String[] args) {
        
        String str, msg;
        int option;

        do {
            str = JOptionPane.showInputDialog("Inserisci una stringa");
            
            msg = checkPalindrome(str) ? "La stringa " + str + " è palindroma" : "La stringa " + str + " non è palindroma";
            JOptionPane.showMessageDialog(null, msg);
            
            option = JOptionPane.showConfirmDialog(null, "Rielaborare una nuova stringa?");
        } while (option == 0);
    }
    
}
