/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es82;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, i = 0;
        long sum = 0;
        
        do {
            System.out.println("Inserire un int positivo");
            n = in.nextInt();
        } while (n < 0);
        
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Somma: " + sum);
    }
    
}
