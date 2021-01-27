/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es81;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, p, i = 1;
        
        do {
            System.out.println("Inserire un int minore di 100:");
            n = in.nextInt();
        } while (n > 100);
        
        do {
            System.out.println("Inserire un int minore di 10:");
            p = in.nextInt();
        } while (p > 10);
        
        System.out.println("Divisori:");
        
        while (i <= n) {
            if (i % p == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
    
}
