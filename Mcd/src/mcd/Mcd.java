/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcd;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Mcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int n1 = in.nextInt(), n2 = in.nextInt(), a, b, t, mcm = 0;
        
        a = Math.max(n1, n2);
        b = Math.min(n1, n2);
        
        if (a != 0 && b != 0) {
            while (b != 0) {
                t = b;
                b = a%b;
                a = t;
            }
        }
        System.out.println(a);
    }
    
}
