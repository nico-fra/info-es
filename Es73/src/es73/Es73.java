/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es73;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
            System.out.print("Input a: ");
            double a = in.nextDouble();
            System.out.print("Input b: ");
            double b = in.nextDouble();
            System.out.print("Input c: ");
            double c = in.nextDouble();

            double result = b * b - 4.0 * a * c;

            if (result > 0.0) {
                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
                System.out.println("Le soluzioni sono " + r1 + " e " + r2);
            } else if (result == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("La soluzione e' " + r1);
            } else {
                System.out.println("L'equazione non ha soluzioni.");
            }
    }
    
}
