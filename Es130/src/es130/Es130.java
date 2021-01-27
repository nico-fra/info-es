/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es130;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es130 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, max = 0, min = Integer.MAX_VALUE, max_count = 0, min_count = 0;
        
        do {
            System.out.println("Inserire un int positivo");
            n = in.nextInt();
        } while (n < 0);
        
        int[] arr = new int[n];
        
        for (int i=0; i<n; i++) {
            arr[i] = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
        }
        
        for (int i : arr) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        
        for (int i : arr) {
            if (i == max)
                max_count++;
            if (i == min)
                min_count++;
        }
        System.out.println("Il massimmo compare " + max_count + " volte");
        System.out.println("Il minimo compare " + min_count + " volte");
    }
    
}
