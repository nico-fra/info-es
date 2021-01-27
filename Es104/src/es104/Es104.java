/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es104;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, temp, pari = 0;
        
        System.out.println("Quanti lanci vuoi fare?");
        n = in.nextInt();
        
        for (int i=0; i<n; i++) {
            temp = (int) (Math.random()*6)+1;
            if (temp%2 == 0)
                pari ++;
        }
        System.out.println((double)pari / n);
    }
    
}
