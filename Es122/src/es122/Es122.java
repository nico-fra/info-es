/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es122;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, range, dice1, dice2;
        String str = "";
        
        do {
            System.out.println("Inserire un int positivo");
            n = in.nextInt();
        } while (n < 0);
        
        int[] arr = new int[n];
        int[] ranges = new int[3];
        
        for (int i=0; i<arr.length; i++) {
            dice1 = (int) (Math.random() * 4) + 1;
            dice2 = (int) (Math.random() * 4) + 1;
            arr[i] = dice1 + dice2;
            
            range = (dice1 + dice2 <= 4)
                    ? 0 : (dice1 + dice2 >= 6)
                    ? 2 :
                    1;
            
            ranges[range] ++;
        }
        
        for (int i=0; i<ranges.length; i++) {
            str = (i == 0) ? "tra 2 e 4: " + ranges[i] :
                  (i == 1) ? "pari a 5: " + ranges[i] :
                  "tra 6 e 8" + ranges[i];
            System.out.println("Numero di punteggi " + str);
        }
    }
    
}
