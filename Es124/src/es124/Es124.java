/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es124;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es124 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, tot = 0;
        
        do {
            System.out.println("Inserire importo");
            n = in.nextInt();
            tot += in.nextInt();
        } while (n != 0);
        System.out.println(tot);
    }
    
}
