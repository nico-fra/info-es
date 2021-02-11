/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = 0, b = 1, c = 0, n;
        n = in.nextInt();
        
        for (int i=0; i<n; i++) {
            System.out.println(a);
            c = b + a;
            a = b;
            b = c;
        }
    }
    
}
