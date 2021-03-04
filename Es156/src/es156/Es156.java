/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es156;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es156 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float n = 0;
        
        System.out.println("Inserire un float");
        if (in.hasNextFloat()) {
            n = in.nextFloat();
        }
        
        System.out.println(LeggiNumeroFloat(n));
    }
    
    public static float LeggiNumeroFloat(float n) {
        return n;
    }
    
}
