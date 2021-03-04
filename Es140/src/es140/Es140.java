/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es140;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es140 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt(), d1, d2;
        
        for (int i=0; i<n; i++) {
            d1 = (int) (Math.random()*6)+1;
            d2 = (int) (Math.random()*6)+1;
            if ((d1+d2)%2==0)
                System.out.println("La somma di " + d1 + " e " + d2 + " è pari");
        }
    }
    
}
