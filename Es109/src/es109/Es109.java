/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es109;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es109 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("Inserire una stringa");
        String str = in.nextLine();
        
        System.out.println("Inserire il carattere da cercare");
        char c = in.next().charAt(0);
        
        int index = str.indexOf(c);
        
        System.out.println("Usando indexOf la posizione del carattere è: " + index);
        
        for (int i=0; i<str.length(); i++)
            if (str.charAt(i) == c)
                System.out.println("Usando un for loop la posizione del carattere è: " + i);
    }
    
}