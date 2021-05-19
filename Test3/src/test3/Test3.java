/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;
import javax.swing.*;

/**
 *
 * @author nick
 */

// esercizio 2

public class Test3 {

    public static int[] RiempiArray(int n, int max, int min) {
        int[] temp = new int[n];
        for (int i=0; i<n; i++) temp[i] = (int) (Math.random()*((max-min)+1)+min);
        return temp;
    }
    
    public static int ContaUguali(int[] arr1, int[] arr2) {
        int temp = 0;
        
        for (int i=0; i<arr1.length; i++)
            if (arr1[i] == arr2[i]) temp++;
        return temp;
    }
    
    public static void main(String[] args) {
        int n;
        try{
            do {
                n = Integer.valueOf(JOptionPane.showInputDialog("Inserire un int maggiore di 0"));
            } while (n < 0);
        } catch (NumberFormatException e) {
            n = 1;
        }
        
        int[] arr1 = new int[n], arr2 = new int[n];
        
        arr1 = RiempiArray(n, 10, 1);
        arr2 = RiempiArray(n, 12, 2);
        
        JOptionPane.showMessageDialog(null, ContaUguali(arr1, arr2));
    }
}
