/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es94;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, count = 0;
        
        for (int i=0; i<15; i++) {
            do {
                n = in.nextInt();
                if (n < 0)
                    System.out.println("Inserire valori positivi");
            } while (n<0);
            
            if (n%2 == 0)
                count ++;
        }
        System.out.println(count);
    }
}
