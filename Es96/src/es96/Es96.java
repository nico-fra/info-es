/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es96;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es96 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int nPesi, count = 0;
        float n;

        do {
            nPesi = in.nextInt();
            if (nPesi <= 0)
                System.out.println("Inserire un valore positivo.");
        } while (nPesi <=0);
        
        for (int i=0; i<nPesi; i++) {
            do {
                n = in.nextFloat();
                
                if (n < 0) 
                    System.out.println("Il peso non può essere negativo.");
                if (n > 7.25)
                    count ++;
            } while (n < 0);
        }
        System.out.println(count);
    }
    
}
