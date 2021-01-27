/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es120;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es120 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, input;
        
        // Numero totale di vendite
        do {
            System.out.println("Inserire un int positivo");
            n = in.nextInt();
        } while (n < 0);
        
        // Arrays
        int[] arr = new int[n];
        int[] decadi = new int[3];
        
        // Riempire gli array con valori tra 1 e 30
        for (int i=0; i<n; i++) {
            do {
                System.out.println("Inserire numeri tra 1 e 30");
                input = in.nextInt();
                
                if (!(input < 1 || input > 30))
                    arr[i] = input;
            } while (input < 1 || input > 30);
        }
        
        // Riempire array delle decadi
        for (int i=0; i<arr.length; i++) {
            if (arr[i] <= 10)
                decadi[0] += 1;
            else if (arr[i] > 10 && arr[i] <= 20)
                decadi[1] += 1;
            else
                decadi[2] += 1;
        }
        
        // Vedere risultato in output
        for (int i=0; i<3; i++)
            System.out.println(decadi[i]);
    }
    
}
