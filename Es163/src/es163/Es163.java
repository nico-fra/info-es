/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es163;

/**
 *
 * @author nick
 */
public class Es163 {

    public static int MaxInArray(int[] arr) {
        int i, max = arr[0]; 
  
        for (i = 1; i < arr.length; i++) 
            if (arr[i] > max) 
                max = arr[i]; 

        return max; 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
