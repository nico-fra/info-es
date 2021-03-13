/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es165;

/**
 *
 * @author nick
 */
public class Es165 {

    public static boolean VerificaInArray(int[] arr, int n) {
        for (int i : arr)
            if (i == n)
                return true;
        return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
