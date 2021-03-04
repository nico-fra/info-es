/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeorfactorization;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class PrimeOrFactorization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int m = n, i = 2, tmp = 2;
        
        while (n > 1) {
            if (n%i!=0) {
                if (n==i+1) {
                    System.out.println("primo");
                }
                i++;
            } else {
                System.out.printf("non primo, la fattorizzazione è: ");
                while (n > 1) {
                    if (n%tmp==0) {
                        System.out.printf("%s", tmp + " * ");
                        n /= tmp;
                    } else {
                        tmp++;
                    }
                }
            }
        }
    }
    
}
