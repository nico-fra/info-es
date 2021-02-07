/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es148;

import java.util.Scanner;

/**
 *
 * @author nick
 */
public class Es148 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Inserire un intero da convertire");
        int n = Math.abs(in.nextInt());
        String bin = "";
        
        while (n > 0) {
            bin = ((n%2) == 0 ? "0" : "1") + bin;
            n = n / 2;
        }
        System.out.println(bin);
    }
    
}
