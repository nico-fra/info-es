/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es129;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es129 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, tot = 0;
        double input_max, input_min, min = Double.MAX_VALUE, max = 0;
        
        do {
            System.out.println("Inserire un int positivo");
            n = in.nextInt();
        } while (n < 0);
                
        for (int i=0; i<n; i++) {
            System.out.println("Inserire la temperatura massima");
            input_max = in.nextDouble();
            System.out.println("Inserire la temperatura minima");
            input_min = in.nextDouble();
            if (input_max > max)
                max = input_max;
            if (input_min < min)
                min = input_min;
        }
        System.out.println("Temperatura massima: " + max);
        System.out.println("Temperatura minima: " + min);
    }
    
}
