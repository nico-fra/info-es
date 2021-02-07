/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es145;

import java.util.Scanner;

/**
 *
 * @author nick
 */
public class Es145 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Inserire un numero intero");
        int n = Math.abs(in.nextInt()), count = 0;
        
        for (int i=1; i < n; i++) {
            if (n % i == 0) {
                count += i;
            }
        }
        
        if (count == n)
            System.out.println("Il numero è perfetto");
        else
            System.out.println("Il numero non è perfetto");
        
    }
    
}
