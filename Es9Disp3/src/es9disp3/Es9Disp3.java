/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es9disp3;

/**
 *
 * @author nick
 */
public class Es9Disp3 {

    public static String reverse(String str) {
        if (str.length() == 0) return str;
        else return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
    }
    
    public static void main(String[] args) {
        // System.out.println(reverse(str));
    }
    
}
