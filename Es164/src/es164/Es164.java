/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es164;

/**
 *
 * @author nick
 */
public class Es164 {

    public static int MaxInArray(int[] arr) {
        int i, min = arr[0]; 
  
        for (i = 1; i < arr.length; i++) 
            if (arr[i] < min) 
                min = arr[i]; 

        return min; 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
