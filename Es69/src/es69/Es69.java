/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es69;
import java.util.Scanner;

/**
 *
 * @author nick
 */
public class Es69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float num1 = in.nextInt(), num2 = in.nextInt();
        System.out.println("Selezionare un segno:\n+\t1\n-\t2\n*\t3\n/\t4\nMax\t5\nMin\t6\n^\t7\nsqrt\t8");
        int operator = in.nextInt();

        switch (operator) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 / num2);
                break;
            case 4:
                System.out.println(num1 * num2);
                break;
            case 5:
                System.out.println(Math.max(num1, num2));
                break;
            case 6:
                System.out.println(Math.min(num1, num2));
                break;
            case 7:
                System.out.println(Math.pow(num1, num2));
                break;
            case 8:
                System.out.println(Math.pow(num1, (1 / num2)));
                break;
            default:
                System.out.println("Operazione non corretta");
                break;
        }
    }
    
}
