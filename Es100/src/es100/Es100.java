/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es100;

/**
 *
 * @author nick
 */
public class Es100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dado1 = (int) (Math.random()*6+1), dado2 = (int) (Math.random()*6+1);
        System.out.println("Somma di due dadi: " + (dado1 + dado2));
    }
    
}
