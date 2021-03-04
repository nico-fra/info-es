/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es158;

/**
 *
 * @author nick
 */
public class Es158 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static int Fibonacci(int n) {
        if (n <= 1)
            return n;
 
        int a = 0, b = 1;
        for (int i = 0; i < n - 1; i++)
        {
            int c = a + b;
            a = b;
            b = c;
        }
 
        return b;
    }
    
}
