/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, m;
        
        n = in.nextInt();
        
        for (int i=2; i*i <= n; i++) {
            if (n%i==0)
                System.out.println(i + " ");
            while (n%i==0)
                n /= i;
        }
        if (n>1)
            System.out.println(n);
        else
            System.out.println();
    }
    
}
