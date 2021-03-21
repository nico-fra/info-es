/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es3disp2;
import javax.swing.JOptionPane;
/**
 *
 * @author nick
 */
public class Es3Disp2 {

    public static int[] checkLetters(String str) {
        int voc=0, cons=0;

        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                voc++;
            else if((ch >= 'a'&& ch <= 'z'))
                cons++;
        }
        int[] count = {voc, cons};
        return count;
    }

    public static void main(String[] args) {
        String str, msg;
        int option, num[] = new int[2];
        
        do {
            str = JOptionPane.showInputDialog("Inserisci una stringa");
            
            num = checkLetters(str);
            
            msg = "Il numero di vocali è " + num[0] + ", il numero di consonanti è " + num[1];
            JOptionPane.showMessageDialog(null, msg);

            option = JOptionPane.showConfirmDialog(null, "Rielaborare una nuova stringa?");
        } while (option == 0);
    }
    
}
