/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorization2;

import java.util.Scanner;

/**
 *
 * @author nick
 */
public class Factorization2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        long n = in.nextInt(), i;
        
        i = 2;
        while (n>1) {
            if (n%i==0) {
                System.out.println(i);
                if (n>1)
                n /= i;
            } else
                i += 1;
        }
    }
    
}
