/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es125;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es125 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n;
        double avg_min = 0, avg_max = 0;
        
        do {
            System.out.println("Inserire un int positivo");
            n = in.nextInt();
        } while (n < 0);
        
        for (int i=0; i<n; i++) {
            System.out.println("Inserire la temperatura massima");
            avg_max += in.nextDouble();
            System.out.println("Inserire la temperatura minima");
            avg_min += in.nextDouble(); 
        }
        System.out.println("La media delle massime è: " + (avg_max/n));
        System.out.println("La media delle minime è: " + (avg_min/n));
    }
    
}
