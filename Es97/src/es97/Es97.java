/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es97;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es97 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, nDispari, count = 0;
        
        do {
            n = in.nextInt();
            
            if (n <= 5 || n >= 20)
                System.out.println("Inserire un valore intero tra 5 e 20.");
        } while (n < 5 || n > 20);

        for (int i=0; i < n; i++) {
            nDispari = in.nextInt();
            
            if (nDispari%2 != 0)
                count ++;
        }
        System.out.println(count);
    }
    
}
