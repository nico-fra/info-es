/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es98;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es98 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, count = 0;
        
        do {
            n = in.nextInt();
            if (n >= 20 || n <= 0)
                if (n != -1)
                    System.out.println("Inserire valori tra 0 e 20.");
            if (n == 10)
                count ++;
        } while (n != -1);
        System.out.println(count);
    }
    
}
