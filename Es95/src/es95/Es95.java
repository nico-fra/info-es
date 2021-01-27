/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es95;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float n;
        int count = 0;
        
        for (int i=0; i<10; i++) {
            do {
                n = in.nextFloat();
                
                if (n > 20 || n < -20)
                    System.out.println("Inserire valori tra 20 e -20");
                if (n <= 9 && n >= 1)
                    count ++;
            } while (n > 20 || n < -20);
        }
        System.out.println(count);
    }
    
}
