/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es103;

/**
 *
 * @author nick
 */
public class Es103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int testa = 0, croce = 0;
        boolean temp;
        
        do {
            temp = Math.random() > 0.5;
            if (temp)
                testa ++;
            else
                croce ++;
        } while (testa != croce);
        
        System.out.println(testa + croce);
    }
    
}
