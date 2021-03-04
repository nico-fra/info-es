/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial2;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Factorial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt(), tot = 1;
        
        while (n>1) {
            tot *= n;
            n--;
        }
        System.out.println(tot);
    }
    
}
