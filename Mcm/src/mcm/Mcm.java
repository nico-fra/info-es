/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcm;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Mcm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int n1 = in.nextInt(), n2 = in.nextInt(), a, b, c = 1, mcm = 0;
        
        a = Math.max(n1, n2);
        b = Math.min(n1, n2);
        
        if (a != 0 && b != 0) {
            boolean end = false;
            while (!end) {
                mcm = c * a;
                if (mcm%b==0)
                    end = true;
                else
                    c +=1;
            }
        }
        System.out.println(mcm);
    }
    
}
