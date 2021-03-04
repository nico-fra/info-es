/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt(), i = 2;
        
        while (n > i) {
            if (n%i!=0) {
                if (n==i+1)
                    System.out.println("È primo");
                i++;
            } else {
                System.out.println("Non è primo");
                break;
            }
        }
        
    }
    
}
