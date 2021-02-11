/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorization;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Factorization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, tmp;
        n = in.nextInt();
        tmp = 2;
        
        while (n>1) {
            if (n%tmp==0) {
                n /= tmp;
                System.out.println(tmp);
            } else {
                tmp += 1;
            }
        }
        
    }
    
}
