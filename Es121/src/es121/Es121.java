/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es121;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, count_pos = 0, count_neg = 0;
        double input;
        
        do {
            System.out.println("Inserire un int positivo");
            n = in.nextInt();
        } while (n < 0);
                
        for (int i=0; i<n; i++) {
            System.out.println("Inserire il valore di una temperatura");
            input = in.nextDouble();
            if (input < 0)
                count_neg ++;
            else
                count_pos ++;
        }
        System.out.println("Temperature negative: " + (count_neg/(double)n*100) + "%, temperature positive o nulle: " + (count_pos/(double)n*100) + "%");
    }
    
}
