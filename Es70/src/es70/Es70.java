/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es70;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es70 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int price1 = in.nextInt(), price2 = in.nextInt(), price3 = in.nextInt(), price4 = in.nextInt(), price5 = in.nextInt(), total = 0;
        
        if (price1 > 15) {
            total += 1;
        }
        if (price2 > 15) {
            total += 1;
        }
        if (price3 > 15) {
            total += 1;
        }
        if (price4 > 15) {
            total += 1;
        }
        if (price5 > 15) {
            total += 1;
        }
        System.out.println("In totale " + total + " libri costano piu' di 15 euro.");
    }
    
}
