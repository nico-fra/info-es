/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es114;

/**
 *
 * @author nick
 */
public class Es114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i=0; i<arr.length; i++) {
            arr[i] = Math.random() > 0.5 ? 1 : -1;
            System.out.println(arr[i]);
        }
    }
    
}
