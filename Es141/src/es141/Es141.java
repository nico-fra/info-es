/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es141;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es141 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n1 = 0, n2 = 0, t = 0;
        
        do {
            System.out.println("Inserire 2 numeri positivi diversi da 0");
            n1 = in.nextInt();
            n2 = in.nextInt();
        } while (n1 == 0 && n2 == 0);
        
        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);
        
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        System.out.println("MCD: " + a);
    }
    
}
