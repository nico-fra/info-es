/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es72;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class Es72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        String equation = in.nextLine();
        
        	int n = equation.length(), 
		sign = 1, coeff = 0; 
	int total = 0, i = 0; 

	for (int j = 0; j < n; j++) { 
            if (equation.charAt(j) == '+' || equation.charAt(j) == '-') { 
                    if (j > i) {
                            total += sign * Integer.parseInt(equation.substring(i, j));
                    }
                    i = j; 
            } else if (equation.charAt(j) == 'x') { 
		if ((i == j) || equation.charAt(j - 1) == '+') {
                    coeff += sign; 
                } else if (equation.charAt(j - 1) == '-') {
                    coeff -= sign;
                } else {
                    coeff += sign * Integer.parseInt(equation.substring(i, j));
                }
                i = j + 1; 
            } else if (equation.charAt(j) == '=') { 
                if (j > i) {
                    total += sign * Integer.parseInt(equation.substring(i, j));
                }
                sign = -1; 
                i = j + 1; 
            } 
	} 

	if (i < n) {
		total = total + sign * Integer.parseInt(equation.substring(i)); 
        }
	if (coeff == 0 && total == 0) {
		System.out.println("Soluzioni infinite"); 
        }
        
	if (coeff == 0 && total != 0) {
		System.out.println("Non ci sono soluzioni"); 
        }
        
	int ans = -total / coeff; 
	System.out.println(Integer.toString(ans)); 
        
    }
    
}
