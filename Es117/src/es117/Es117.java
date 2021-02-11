/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es117;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n;
        
        do {
            System.out.println("Inserire un valore intero naturale");
            n = in.nextInt();
        } while (n <= 0);
        
        int[] arr = new int[n];
        int[] revArr = new int[n];
        
        for (int i=0; i<arr.length; i++) {
            arr[i] = (int) (Math.random() * 25);
        }
        for (int i=0; i<arr.length; i++) {
            revArr[i] = arr[arr.length-i-1];
        }
        for (int i=0; i<arr.length; i++) {
            if (i==0)
                System.out.printf("Vettore = [");
            else if (i==arr.length-1)
                System.out.printf("]\n");
            else
                System.out.printf(arr[i] + ", ");
        }
        for (int i=0; i<revArr.length; i++) {
            if (i==0)
                System.out.printf("Vettore = [");
            else if (i==revArr.length-1)
                System.out.printf("]\n");
            else
                System.out.printf(revArr[i] + ", ");
        }
    }
    
}
