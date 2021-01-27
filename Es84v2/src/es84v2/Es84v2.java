/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es84v2;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es84v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner (System.in);
        
        do {
            System.out.println("Int da fattorizzare: ");
            n = in.nextInt();
        } while (n < 0);
        
        for (int i=2; 1<n; i++) {
            while (n%i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
    }
}