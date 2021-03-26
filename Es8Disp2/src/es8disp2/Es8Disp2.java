/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es8disp2;
import javax.swing.*;
/**
 *
 * @author nick
 */
public class Es8Disp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option;
        float voti[] = new float[10], avg, max=0, min=Float.MAX_VALUE, tmp=0, input;
        
        do {
            for (int i=0; i<voti.length; i++) {
                do {
                    input = Float.valueOf(JOptionPane.showInputDialog("Inserisci un voto"));
                    if (input >= 1f && input <= 10f)
                        voti[i] = input;
                    else
                        JOptionPane.showInputDialog("Inerire valori tra 1 e 10");
                } while (input <= 1f || input >= 10f);
            }
            
            for (float i : voti) {
                tmp += i;
                
                if (i>max)
                    max = i;
                if (i<min)
                    min = i;
            }
            avg = tmp/10;
            
            JOptionPane.showMessageDialog(null, "La media è " + avg + ", il voto massimo è " + max + ", il voto minimo è " + min);
            
            option = JOptionPane.showConfirmDialog(null, "Rielaborare nuovi voti?");
        } while (option==0);
    }
    
}
