/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es85v2;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es85v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, s = 0;

        do {
            System.out.print ("Inserire un int positivo: ");
            n = in.nextInt();
        } while (n < 0);
        
        for (int i=1; i < n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        
        if (s == n) {
            System.out.println(n + " è un numero perfetto");
        } else {
            System.out.println(n + " non è un numero perfetto");
        }
    }
    
}
