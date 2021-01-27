/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es107;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es107 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner (System.in);
        
        System.out.println("Inserire una stringa");
        String str = in.nextLine();
        
        do {
            System.out.println("Inserire un intero positivo");
            n = in.nextInt();
            if (n<0)
                System.out.println("n deve essere positivo");
            if (n>str.length())
                System.out.println("n deve essere minore della lunghezza dell stringa");
        } while (n < 0 || n > str.length());
        
        for (int i=0; i<str.length()-n+1; i++) {
            System.out.println(str.substring(i, i+n));
        }
    }
    
}
