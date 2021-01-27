/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es71;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num1 = in.nextInt(), num2 = in.nextInt(), num3 = in.nextInt();
        
        int middle = 0;
        
        if ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1)) {
            middle = num2; 
        } else if ((num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2)) {
        middle = num1; 
        } else {
            middle =  num3; 
        }
        
        System.out.println("Ordine ascendente: " + Math.min(num1, Math.min(num2, num3)) + ", " + middle + ", " + Math.max(num1, Math.max(num2, num3)));
        System.out.println("Ordine discendente: " + Math.max(num1, Math.max(num2, num3)) + ", " + middle + ", " + Math.min(num1, Math.min(num2, num3)));
    }
    
}
