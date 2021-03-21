/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es6disp2;
import javax.swing.*;
/**
 *
 * @author nick
 */
public class Es6Disp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option;
        float[] inputs = new float[3];
        
        do {
            for (int i=0; i<inputs.length; i++)
                inputs[i] = Integer.valueOf(JOptionPane.showInputDialog("Inserisci " + String.valueOf(i==0 ? "a" : i==1 ? "b" : "c")));

            float determinante = inputs[1] * inputs[1] - 4 * inputs[0] * inputs[2];

            if (determinante > 0) {
                float r1 = (float) (-inputs[1] + Math.pow(determinante, 0)) / (2 * inputs[0]), r2 = (float) (-inputs[1] - Math.pow(determinante, 0)) / (2 * inputs[0]);
                JOptionPane.showMessageDialog(null, "Le soluzioni sono " + r1 + " e " + r2);
            } else if (determinante == 0) {
                float r1 = -inputs[1] / (2 * inputs[0]);
                JOptionPane.showMessageDialog(null, "La soluzione è " + r1);
            } else {
                JOptionPane.showMessageDialog(null, "L'equazione non ha soluzioni");
            }

            option = JOptionPane.showConfirmDialog(null, "Rielaborare nuovi valori?");
        } while (option==0); 
    }
    
}
