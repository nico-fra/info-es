/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es99;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es99 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float n;
        int count = 0;
        
        do {
            System.out.println("Inserire valori tra 0.5m e 2.5m");
            
            n = in.nextFloat();
            
            if (n >= 2.5 || n <= 0.5)
                System.out.println("Errore, inserire valori tra 0.5m e 2.5m");
            if (n > 1.6 && n < 1.9)
                count ++;
        } while (n >= 0);
        System.out.println(count);
    }
    
}
