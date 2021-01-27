/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es106;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstHalf = "", secondHalf = "", revSecondHalf = "";
        Scanner in = new Scanner (System.in);
       
        System.out.println("Inserire una stringa e verificare se è palindroma:");
        String str = in.nextLine();
        
        firstHalf = str.substring(0, str.length()/2);
        secondHalf = str.substring(str.length()/2, str.length());
        
        if (str.length()%2 != 0) {
            secondHalf = secondHalf.substring(1);
        }
        for (int i=secondHalf.length()-1; i>=0; i--) {
            revSecondHalf = revSecondHalf + secondHalf.charAt(i);
        }
        if (firstHalf.equals(revSecondHalf))
            System.out.println("È palindroma, la stringa è: " + str);
        else
            System.out.println("Non è palindroma, la stringa è: " + str);
    }
    
}
