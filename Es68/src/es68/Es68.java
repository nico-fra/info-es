/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es68;
import java.util.Scanner;

/**
 *
 * @author nick
 */
public class Es68 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int num1 = in.nextInt(), num2 = in.nextInt();
        char operator = in.next().charAt(0);
        
        int intOperator = (int) operator;

        switch (intOperator) {
            case 43:
                System.out.println(num1 + num2);
                break;
            case 45:
                System.out.println(num1 - num2);
                break;
            case 47:
                System.out.println(num1 / num2);
                break;
            case 42:
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Operazione non corretta");
                break;
        }
    }
    
}
