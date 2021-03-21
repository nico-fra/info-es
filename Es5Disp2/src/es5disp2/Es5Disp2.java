/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es5disp2;
import javax.swing.*;
/**
 *
 * @author nick
 */
public class Es5Disp2 {

    public static float FahrenheitToCelsius(float gradi_f) {
        return (gradi_f-32)/1.8f;
    }
    
    public static float CelsiusToFahrenheit(float gradi_c) {
        return gradi_c*1.8f+32;
    }
    
    public static void main(String[] args) {
        String msg;
        int option;
        float num, input;

        do {
            Object options[] = {"Celsius to Fahrenheit", "Fahrenheit to Celsius"};
            Object conversion = JOptionPane.showInputDialog(null, "Scegli la conversione", "Conversione", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            
            input = Integer.valueOf(JOptionPane.showInputDialog("Inserisci un valore da convertire"));
            
            if (conversion == "Celsius to Fahrenheit")
                num = CelsiusToFahrenheit(input);
            else
                num = FahrenheitToCelsius(input);
            
            msg = "Il valore convertito è " + num;
            JOptionPane.showMessageDialog(null, msg);

            option = JOptionPane.showConfirmDialog(null, "Rielaborare un nuovo valore?");
        } while (option == 0);
    }
    
}
