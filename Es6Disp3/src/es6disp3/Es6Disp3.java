/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es6disp3;

/**
 *
 * @author nick
 */
public class Es6Disp3 {
    
    public static int sum(int a, int b) {
        return a+b;
    }
    
    public static int sub(int a, int b) {
        return a-b;
    }

    static int prod(int a, int b) {
        if (a==0 || b==0) return 0;
        else if (b > 0) return sum(a, prod(a, b-1));
        else return sum(-a, prod(a, b+1));
    }
    
    public static void main(String[] args) {
        // System.out.println(prod(2, 5));
    }

}
