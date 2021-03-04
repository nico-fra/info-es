/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es157;

/**
 *
 * @author nick
 */
public class Es157 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static float ConvertiInC(float gradi_f) {
        return (gradi_f-32)/(9/5);
    }
    
    public static float ConvertiInF(float gradi_c) {
        return gradi_c*(9/5)+32;
    }
    
}
