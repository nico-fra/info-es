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
        long n, res, div;
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.print("Int da fattorizzare ");
            n = in.nextLong();
        } while (n < 0);
        System.out.print(n + " =");
        div = 2;
        res = n;
        while(res > 1)
        {
            while(res % div == 0)
            {
                if(res == n)
                    System.out.print(" " + div);
                else
                    System.out.print(" * " + div);

                res = res / div;
            }
            div++;
        }
        System.out.println();
    }
    
}
