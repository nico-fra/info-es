/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo2;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Fibo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        long n = in.nextInt(), a = 0, b = 1, c;
        
        for (int i=0; i<n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
    
}
