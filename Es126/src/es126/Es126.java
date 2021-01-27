/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es126;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es126 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, tot = 0;
        
        do {
            System.out.println("Inserire un int positivo");
            n = in.nextInt();
        } while (n < 0);
        
        for (int i=0; i<n; i++) {
            tot += ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
        }
        System.out.println("La media è " + (double)tot/n);
    }
    
}
