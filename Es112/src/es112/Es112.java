/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es112;
import java.util.Scanner;

/**
 *
 * @author nick
 */
public class Es112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("Inserire una stringa");
        System.out.println(in.nextLine().toUpperCase());
    }
    
}
