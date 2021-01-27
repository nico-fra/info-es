/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es108;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es108 {

    /**
     * @parsam args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Inserire una stringa:");
        String str = in.nextLine(), rev = "";
        
        for (int i=str.length()-1; i>=0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
    
}
