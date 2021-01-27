/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es110;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String voc = "aeiou", cons = "bcdfghjklmnpqrstvwxyz";
        int vocCount = 0, consCount = 0;
        
        System.out.println("Inserire una stringa");
        String str = in.nextLine().toLowerCase();
        
        for (int i=0; i<str.length(); i++) {
            for (int j=0; j<voc.length(); j++)
                if (str.charAt(i) == voc.charAt(j))
                    vocCount ++;
            for (int j=0; j<cons.length(); j++)
                if (str.charAt(i) == cons.charAt(j))
                    consCount ++;
        }
        System.out.println("Il numero delle vocali è: " + vocCount + ", il numero delle consonanti è: " + consCount);
    }
    
}
