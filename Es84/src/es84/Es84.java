/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es84;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, i = 2;
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.print("Int da fattorizzare ");
            n = in.nextInt();
        } while (n < 0);

        while (1<n) {
            while (n%i == 0) {
                System.out.println(i);
                n /= i;
            }
            i++;
        }
    }
}