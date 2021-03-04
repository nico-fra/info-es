/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es155;

/**
 *
 * @author nick
 */
public class Es155 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // System.out.println(GiornoCasuale());
    }
    
    public static String GiornoCasuale() {
        String[] settimana = {"Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica"};
        return settimana[(int) Math.random()*7];
    }
    
}
