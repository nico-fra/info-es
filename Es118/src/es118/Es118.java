/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es118;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es118 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n;
        
        // Controllo input
        do {
            System.out.println("Inserire un int positivo");
            n = in.nextInt();
        } while (n < 0);
        
        // Dichiarazione arrays
        int[] arr = new int[n];
        int[] range = new int[11];
        int[] count = new int[11];
        
        // riempire primo array di lunghezza n con valori casuali 
        for (int i=0; i<arr.length; i++) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            arr[i] = dice1 + dice2;
        }
        
        // Riempire il secondo array
        for (int i=0; i<range.length; i++) {
            range[i] = i+2;
        }
        
        // Riempire l'array count con i valori ripetuti e visualizzare l'esito in output
        for (int i=0; i<range.length; i++) {
            for (int j=0; j<arr.length; j++) {
                if (range[i] == arr[j])
                    count[i] = count[i] + 1;
            }
            System.out.println("Il valore " + (i+2) + " compare " + count[i] + " volte");
        }
    }
    
}
 