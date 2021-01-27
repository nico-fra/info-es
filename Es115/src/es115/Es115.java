/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es115;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es115 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, input;
        
        do {
            System.out.println("Inserire un int positivo");
            n = in.nextInt();
        } while (n < 0);
        
        int[] arr = new int[n];
        
        for (int i=0; i<arr.length; i++) {
            do {
                System.out.println("Inserire numeri tra 5 e 25");
                input = in.nextInt();
                
                if (!(input < 5 || input > 25))
                    arr[i] = input;
            } while (input < 5 || input > 25);
        }
        
        for (int i=0; i<arr.length; i++) {
            if (i == 0)
                System.out.printf("%s", "Vettore = [" + arr[i] + ", ");
            else if (i == arr.length-1)
                System.out.printf("%s", arr[i] + "]");
            else
                System.out.printf("%s", arr[i] + ", ");  
        }
    }
    
}
