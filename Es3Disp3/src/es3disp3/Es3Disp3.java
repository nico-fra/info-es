/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es3disp3;

/**
 *
 * @author nick
 */
public class Es3Disp3 {

    public static int inc(int n) {
        return ++n;
    }
    
    public static int dec(int n) {
        return --n;
    }
    
    public static int sum(int n, int m) {
        if (n > 0) return sum(dec(n), inc(m));
        else if (n < 0) return sum(inc(n), dec(m));
        else return m;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(-4, 6));
    }
    
}