/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es85;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, d = 1, s = 0;

        do {
            System.out.print ("Inserire un int positivo: ");
            n = in.nextInt();
        } while (n < 0 && n != (int)n);
        
        while (d < n) {
            if (n % d == 0) {
                s += d;
            }
            d++;
        }
        
        if (s == n) {
            System.out.println(n + " è un numero perfetto");
        } else {
            System.out.println(n + " non è un numero perfetto");
        }
    }
    
}
