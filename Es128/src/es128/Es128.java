/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es128;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es128 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, max = 0, min = Integer.MAX_VALUE;
       
        do {
            System.out.println("Inserire importo");
            n = in.nextInt();
            if (n > max)
                max = n;
            if (n < min)
                if (n != 0)
                    min = n;
        } while (n != 0);
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
    
}
