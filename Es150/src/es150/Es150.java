/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es150;

import java.util.Scanner;

/**
 *
 * @author nick
 */
public class Es150 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, a = 0, b = 1, c, count = 0;
        
        do {
            System.out.println("Inserire un numero intero tra 1 e 12");
            n = in.nextInt();
        } while (n < 1 || n > 12);
        
        if (n == 1 || n == 2)
            System.out.println(1);
        else {
            while (count < n) {
                c = b + a;
                a = b;
                b = c;
                count ++;
            }
            System.out.println(a);
        }
    }
    
}
