/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es83;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, i = 0, p;
        
        do {
            System.out.println("Inserire un int positivo");
            n = in.nextInt();
        } while (n < 0);
        
        while (i <= n) {
            p = i*i;
            if (p < n) {
                System.out.println(p);
            }
            i++;
        }
    }
    
}
