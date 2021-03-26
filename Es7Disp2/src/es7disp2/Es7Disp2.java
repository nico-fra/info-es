/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es7disp2;
import javax.swing.*;

/**
 *
 * @author nick
 */
public class Es7Disp2 {

    public static float[] pura(float a, float c) {
        float[] tmp = new float[2];
        
        tmp[0] = (float) Math.sqrt(-c/a);
        tmp[1] = (float) -Math.sqrt(-c/a);

        return tmp;
    }
    
    public static float[] spuria(float a, float b) {
        float[] tmp = new float[2];
        
        tmp[0] = -b/a;
        tmp[1] = 0f;
        
        return tmp;
    }
    
    public static float generic(float a, float b) {
        return -b/(2*a);
    }
    
    public static void main(String[] args) {
        int option;
        float a, b, c;
        
        do {
            a = Integer.valueOf(JOptionPane.showInputDialog("Inserisci a"));
            b = Integer.valueOf(JOptionPane.showInputDialog("Inserisci b"));
            c = Integer.valueOf(JOptionPane.showInputDialog("Inserisci c"));
            
            if (a==0)
                JOptionPane.showMessageDialog(null, "A non può essere 0");
            
            else if (b==0f && c!=0f) // Equazione pura
                if (-c/a > 0)
                    JOptionPane.showMessageDialog(null, "Le soluzioni sono: " + pura(a, c)[0] + ", " + pura(a, c)[1]);
                else
                    JOptionPane.showMessageDialog(null, "La soluzione è: " + 0);
            
            else if (b!=0f && c==0f) // Equazione spuria
                JOptionPane.showMessageDialog(null, "Le soluzioni sono: " + spuria(a, b)[0] + ", " + spuria(a, b)[1]);
            
            else if (b==0f && c==0f) // Equazione monomia
                JOptionPane.showMessageDialog(null, "La soluzione è: " + 0);
            
            else if (b!=0 && c!=0) // Equaione generica
                if (b*b - 4*a*c == 0)
                    JOptionPane.showMessageDialog(null, "La soluzione è: " + generic(a, b));
                else 
                    JOptionPane.showMessageDialog(null, "L'equazione non ha soluzioni");
                
            option = JOptionPane.showConfirmDialog(null, "Rielaborare nuovi valori?");
        } while (option==0); 
    }
    
}