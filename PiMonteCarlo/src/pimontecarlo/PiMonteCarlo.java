/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pimontecarlo;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class PiMonteCarlo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt(), count = 0;
                
        double[] x = new double[n];
        double[] y = new double[n];
        
        for (int i=0; i<n; i++) {
            x[i] = Math.random();
            y[i] = Math.random();
        }
        
        for (int i=0; i<n; i++) {
            if (Math.sqrt((x[i]*x[i])+(y[i]*y[i])) <= 1) {
                count ++;
            }
        }
        
        double pi = 4*(double) count/x.length;
        System.out.println(pi);
    }
    
}
