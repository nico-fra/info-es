/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import javax.swing.*;
/**
 *
 * @author nick
 */

// esercizio 1

public class Test {
    public static String AggiungiParole(String s, int n) {
        String temp = "";
        n = Math.abs(n);
        for (int i=0; i<n; i++) temp += s;
        return temp;
    }
    public static String ModificaStringa(String r, int n) {
        String temp = "";
        if (n >= 0) {
            for (int i=0; i<r.length(); i++) {
                char ch = r.charAt(i);
                if (ch >= 'a' && ch <= 'z') temp += (char)((int) ch - 32);
                else temp += r.charAt(i);
            }
        } else {
            for (int i=0; i<r.length(); i++) {
                char ch = r.charAt(i);
                if (ch >= 'A' && ch <= 'Z') temp += (char)((int) ch + 32);
                else temp += r.charAt(i);
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Inserire una stringa"), r = "", rm = "";
        int n;
        try {
            n = Integer.valueOf(JOptionPane.showInputDialog("Inserire un numero"));
        } catch (NumberFormatException e) {
            n = 0;
        }
        r = AggiungiParole(s, n);
        rm = ModificaStringa(r, n);
        JOptionPane.showMessageDialog(null, rm);
    }
    
}
