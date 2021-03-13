/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es177;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es177 {
    
    public static int conteggio;
    
    public static void Conta(int[] arr, int x) {
        for (int i : arr) {
            if (i == x)
                conteggio +=1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n;
        
        do {
            System.out.println("Inserire un valore positivo");
            n = in.nextInt();
        } while (n < 0);
        
        int array[] = new int[n], num = (int) ((Math.random() * (20-1))+1);
        
        for (int i=0; i<array.length; i++) {
            array[i] = (int) ((Math.random() * (20-1))+1);
        }
        
        Conta(array, num);
        
        System.out.println(conteggio);
    }
    
}
