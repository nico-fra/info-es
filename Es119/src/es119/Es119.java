/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es119;
import java.util.Scanner;

/**
 *
 * @author nick
 */
public class Es119 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n;
        double input, max = 0, diff_max = 0, min = Double.MAX_VALUE;
        
        do {
            System.out.println("Inserire numeri tra 5 e 25");
            n = in.nextInt();
        } while (n < 5 || n > 25);
        
        double[] arr = new double[n];
        double[] diff = new double[n-1];
        
        for (int i=0; i<arr.length; i++) {
            do {
                System.out.println("Inserire un int positivo");
                input = in.nextDouble();
                
                if (!(input < 0))
                    arr[i] = input;
            } while (input < 0);
        }
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        
        for (int i=1; i<arr.length; i++) {
            diff[i-1] = Math.abs(arr[i] - arr[i-1]);
            System.out.println(diff[i-1]);
        }
        
        for (int i=0; i<diff.length; i++)
            if (arr[i] > diff_max)
                diff_max = diff[i];
        
        System.out.println("Altezza massima: " + max + "\n"
            + "Alteza minima: " + min + "\n"
            + "Differenza massima: " + diff_max + "\n"
        );
    }
    
}
